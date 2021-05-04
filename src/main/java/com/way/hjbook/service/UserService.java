package com.way.hjbook.service;

import com.way.hjbook.entity.User;
import com.way.hjbook.utils.Result;

/**
 * @Author: wuaoya
 * @Date: 2021-04-21 23:40
 */
public interface UserService {

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    Result userLogin(String username, String password);

    /**
     * 用户注册
     * @param user
     * @return
     */
    Result userRegister(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    Result userModifyInfo(User user);

}
