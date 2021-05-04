package com.way.hjbook.service;

import com.way.hjbook.entity.Admin;
import com.way.hjbook.mapper.AdminMapper;
import com.way.hjbook.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.way.hjbook.utils.ResultCode.*;

/**
 * @Author: wuaoya
 * @Date: 2021-04-24 21:45
 */
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired(required = true)
    private AdminMapper adminMapper;

    @Override
    public Result adminLogin(String username, String password) {
        Result result = new Result();
        try {
            List<Admin> adminList = adminMapper.selectAll();
            for(Admin admin : adminList){
                if(username.equals(admin.getName()) && password.equals(admin.getPassword())){
                    return result.successMassage(SUCCESS);
                }
            }
            return result.errorMassage(ADMIN_ERROR);

        }catch (Exception e){
            System.out.println(e.getMessage());
            }
        return result;
    }

    @Override
    public Result adminModifyPwd(String username, String password, String newPwd) {
        Result result = new Result();
        try {
            List<Admin> adminList = adminMapper.selectAll();
            for (Admin admin : adminList){
                if(username.equals(admin.getName()) && password.equals(admin.getPassword())){
                    admin.setPassword(newPwd);
                    if(1 == adminMapper.updateByPrimaryKey(admin)){
                        return result.successMassage(SUCCESS);
                    }
                    break;
                }
            }
            return result.errorMassage(ADMIN_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
       return result;
    }
}
