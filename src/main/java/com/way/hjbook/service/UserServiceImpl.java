package com.way.hjbook.service;

import com.way.hjbook.entity.User;
import com.way.hjbook.mapper.UserMapper;
import com.way.hjbook.utils.Result;
import com.way.hjbook.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import static com.way.hjbook.utils.ResultCode.*;

/**
 * @Author: wuaoya
 * @Date: 2021-04-21 23:38
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired(required = true)
    private UserMapper userMapper;

    @Override
    public Result userLogin(String username, String password) {
        Result result = new Result();
        try {
            User user = userMapper.selectByUsername(username);
            if(user.getPassword().equals(password)){
                return result.successMassage(SUCCESS, user);
            }
            return result.errorMassage(USER_LOGIN_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Result userRegister(User user) {
        Result result = new Result();
        try {
            User userBase = userMapper.selectByUsername(user.getUsername());
            if(!StringUtils.isEmpty(userBase)){
                return result.errorMassage(USER_HAS_EXISTED);
            }
            if(1 == userMapper.insert(user)){
                return result.successMassage(SUCCESS, user);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Result userModifyInfo(User user) {
        Result result = new Result();
        try{
            User userBase = userMapper.selectByPrimaryKey(user.getId());
            if(StringUtils.isEmpty(userBase)){
               return result.errorMassage(USER_NOT_EXIST);
            }
            if(1 == userMapper.updateByPrimaryKeySelective(user)){
                return result.successMassage(SUCCESS, user);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
