package com.gobuy.sso.controller;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.common.util.ExceptionUtil;
import com.gobuy.pojo.User;
import com.gobuy.sso.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ldb on 2017/5/22.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/check/{content}/{type}",method = RequestMethod.GET)
    @ResponseBody
    public Object checkData(@PathVariable String content,@PathVariable Integer type,@RequestParam(required = false) String callback){
        GoBuyResult result=null;
        if(StringUtils.isBlank(content)){
            result= GoBuyResult.build(400,"校验内容不能为空!");
        }
        if(type==null){
            result= GoBuyResult.build(400,"校验类型不能为空!");
        }
        if(type!=1&&type!=2&&type!=3){
            result= GoBuyResult.build(400,"校验类型错误!");
        }
        //校验出错
        if(result!=null){
            if(StringUtils.isNotBlank(callback)){
                MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(result);
                mappingJacksonValue.setJsonpFunction(callback);
                return mappingJacksonValue;
            }else{
                return result;
            }
        }

        result=userService.checkData(content,type);

        if (null != callback) {
            MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
            mappingJacksonValue.setJsonpFunction(callback);
            return mappingJacksonValue;
        } else {
            return result;
        }

    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public GoBuyResult register(User user){
        try{
            return userService.insertUser(user);
        }catch (Exception e){
            e.printStackTrace();
            return GoBuyResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public GoBuyResult login(String username, String password, HttpServletRequest request, HttpServletResponse response){
        try{
            return userService.login(username,password,request,response);
        }catch (Exception e){
            e.printStackTrace();
            return GoBuyResult.build(500, ExceptionUtil.getStackTrace(e));
        }
    }

    @RequestMapping(value = "/token/{token}",method = RequestMethod.GET)
    @ResponseBody
    public Object getUserByToken(@PathVariable String token,String callback){
        GoBuyResult result;
        try{
            result= userService.getUserByToken(token);
        }catch (Exception e){
            e.printStackTrace();
            result= GoBuyResult.build(500, ExceptionUtil.getStackTrace(e));
        }
        if(StringUtils.isBlank(callback)){
            return result;
        }else{
            MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(result);
            mappingJacksonValue.setJsonpFunction(callback);
            return mappingJacksonValue;
        }
    }

}
