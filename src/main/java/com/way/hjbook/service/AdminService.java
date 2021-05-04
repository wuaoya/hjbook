package com.way.hjbook.service;

import com.way.hjbook.utils.Result;

/**
 * @Author: wuaoya
 * @Date: 2021-04-24 21:45
 */
public interface AdminService {
    /**
     * 管理员登录接口
     * @param username
     * @param password
     * @return
     */
    Result adminLogin(String username, String password);

    /**
     * 修改管理员密码
     * @param username
     * @param password
     * @return
     */
    Result adminModifyPwd(String username, String password, String newPwd);
}
