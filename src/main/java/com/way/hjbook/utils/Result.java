package com.way.hjbook.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: wuaoya
 * @Date: 2021-04-25 23:57
 */
@Data
public class Result implements Serializable {
    private String code;
    private String message;
    private Object data;
    public Result(){};
    public Result(ResultCode resultCode, Object data){
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
    }

    /**
     * 返回错误码
     * @param resultCode
     * @return
     */
    public Result errorMassage(ResultCode resultCode){
        Result result = new Result();
        result.code = resultCode.code();
        result.message = resultCode.message();
        return result;
    }

    /**
     * 返回无参数成功提示
     * @param resultCode
     * @return
     */
    public Result successMassage(ResultCode resultCode){
        Result result = new Result();
        result.code = resultCode.code();
        result.message = resultCode.message();
        return result;
    }

    /**
     * 返回带参数成功提示
     * @param resultCode
     * @param data
     * @return
     */
    public Result successMassage(ResultCode resultCode, Object data){
        Result result = new Result();
        result.code = resultCode.code();
        result.message = resultCode.message();
        result.data = data;
        return result;
    }

}
