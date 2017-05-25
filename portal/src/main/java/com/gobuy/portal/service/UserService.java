package com.gobuy.portal.service;

import com.gobuy.pojo.User;

/**
 * Created by ldb on 2017/5/25.
 */
public interface UserService {
    public User getUserByToken(String token);
}
