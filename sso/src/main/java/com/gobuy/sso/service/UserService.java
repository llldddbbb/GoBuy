package com.gobuy.sso.service;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.pojo.User;

/**
 * Created by ldb on 2017/5/22.
 */
public interface UserService {

    GoBuyResult checkData(String content,Integer type);

    GoBuyResult insertUser(User user);

    GoBuyResult login(String userName,String password);

    GoBuyResult getUserByToken(String token);

}
