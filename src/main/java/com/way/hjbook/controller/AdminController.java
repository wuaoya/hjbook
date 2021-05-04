package com.way.hjbook.controller;

import com.way.hjbook.service.AdminService;
import com.way.hjbook.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 管理员
 * @Author: wuaoya
 * @Date: 2021-04-24 21:22
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/login")
    public Result Login(@RequestParam("name") String name, @RequestParam("password") String password){
        return adminService.adminLogin(name, password);
    }

    @PutMapping("/modifyPwd")
    public Result modifyPwd(@RequestParam("name") String name, @RequestParam("password") String password,@RequestParam("newPwd") String newPwd){
        return adminService.adminModifyPwd(name, password, newPwd);
    }
}
