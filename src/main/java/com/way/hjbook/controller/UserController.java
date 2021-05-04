package com.way.hjbook.controller;

import com.way.hjbook.entity.User;
import com.way.hjbook.service.UserService;
import com.way.hjbook.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户
 * @Author: wuaoya
 * @Date: 2021-04-21 23:37
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public Result userLogin(@RequestParam("username") String username,@RequestParam("password") String password){
        return userService.userLogin(username, password);
    }

    @PostMapping("/register")
    public Result userRegister(@RequestBody User user){
        return userService.userRegister(user);
    }

    @PutMapping("/modifyInfo")
    public Result userModifyInfo(@RequestBody User user){
        return userService.userModifyInfo(user);
    }
}
