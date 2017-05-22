package com.gobuy.sso.service;

import com.gobuy.common.pojo.GoBuyResult;
import com.gobuy.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ldb on 2017/5/22.
 */
public interface UserService {

    GoBuyResult checkData(String content,Integer type);

    GoBuyResult insertUser(User user);

    GoBuyResult login(String userName, String password, HttpServletRequest request, HttpServletResponse response);

    GoBuyResult getUserByToken(String token);

}
