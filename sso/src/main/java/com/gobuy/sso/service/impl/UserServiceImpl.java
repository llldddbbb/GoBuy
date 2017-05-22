package com.gobuy.sso.service.impl;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.CookieUtils;
import com.gobuy.common.util.JsonUtils;
import com.gobuy.mapper.UserMapper;
import com.gobuy.pojo.User;
import com.gobuy.sso.dao.JedisClient;
import com.gobuy.sso.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by ldb on 2017/5/22.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private JedisClient jedisClient;

    @Value("${REDIS_USER_SESSION_KEY}")
    private String REDIS_USER_SESSION_KEY;

    @Value("${SSO_SESSION_EXPIRE}")
    private int SSO_SESSION_EXPIRE;


    @Override
    public GoBuyResult checkData(String content, Integer type) {
        //查询条件
        User example=new User();
        //对数据进行校检
        if(type==1){
            example.setUsername(content);
        }else if(type==2){
            example.setPhone(content);
        }else{
            example.setEmail(content);
        }
        //执行查询
        List<User> list = userMapper.select(example);
        if(list==null||list.size()==0){
            return GoBuyResult.ok(true);
        }else{
            return GoBuyResult.ok(false);
        }
    }

    @Override
    public GoBuyResult insertUser(User user) {
        user.setCreated(new Date());
        user.setUpdated(new Date());
        //MD5加密
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
        userMapper.insert(user);
        return GoBuyResult.ok();
    }

    @Override
    public GoBuyResult login(String userName, String password, HttpServletRequest request,HttpServletResponse response) {
        User example=new User();
        example.setUsername(userName);
        List<User> list = userMapper.select(example);
        if(list==null ||list.size()==0){
            return GoBuyResult.build(400,"用户名或密码错误!");
        }
        User user=list.get(0);
        //对比密码
        if(!DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getPassword())){
            return GoBuyResult.build(400,"用户名或密码错误!");
        }
        //生成token
        UUID uuid = UUID.randomUUID();
        String token=uuid.toString();

        //保存用户之前，清空密码
        user.setPassword(null);
        //把用户信息写入redis
        jedisClient.set(REDIS_USER_SESSION_KEY+":"+token, JsonUtils.objectToJson(user));
        //设置session过期时间
        jedisClient.expire(REDIS_USER_SESSION_KEY+":"+token,SSO_SESSION_EXPIRE);

        //添加Cookie逻辑，关闭Cookie则失效
        CookieUtils.setCookie(request,response,"GoBuy_TOKEN",token);

        return GoBuyResult.ok(token);
    }

    @Override
    public GoBuyResult getUserByToken(String token) {
        //根据token从数据库中读取
        String json = jedisClient.get(REDIS_USER_SESSION_KEY + ":" + token);
        if(StringUtils.isBlank(json)){
           return  GoBuyResult.build(400,"此session已过期，请重新登录");
        }
        //更新过期时间
        jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token,SSO_SESSION_EXPIRE);
        return GoBuyResult.ok(json);
    }
}
