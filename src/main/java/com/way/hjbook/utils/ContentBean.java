package com.way.hjbook.utils;

import lombok.Data;

import java.util.HashMap;

/**
 * 返回消息体
 * @Author: wuaoya
 * @Date: 2021-04-30 00:16
 */
@Data
public class ContentBean<T> extends HashMap<String, Object> {
    private T data;
    private String code;
    private String message;

    public ContentBean(){
        this.code = null;
        this.message = null;
        this.data = null;
    }

    public ContentBean(ResultCode resultCode, T data){
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
        PutParameter();
    }

    public ContentBean(String code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
        PutParameter();
    }


    private void PutParameter(){
        this.put("message",this.message);
        this.put("code",this.code);
        this.put("data",this.data);
    }
}
