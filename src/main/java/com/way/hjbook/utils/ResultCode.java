package com.way.hjbook.utils;

/**
 * 返回信息
 * @Author: wuaoya
 * @Date: 2021-04-25 23:39
 */
public enum ResultCode {

    SUCCESS("200","操作成功"),

    PARAM_IS_INVALID("1001","参数无效"),
    PARAM_IS_BLANK("1002","参数为空"),
    PARAM_TYPE_BIND_ERROR("1003","参数类型错误"),
    PARAM_NOT_COMPLETE("1004","参数缺失"),

    USER_NOT_LOGGED_IN("2001","用户未登录，访问的路径需要验证，请登录"),
    USER_LOGIN_ERROR("2002","账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN("2003","账号已被禁用"),
    USER_NOT_EXIST("2004","用户不存在"),
    USER_HAS_EXISTED("2005","该用户名已存在"),

    ADMIN_USERNAME_ERROR("3001", "管理员账号错误！"),
    ADMIN_PASSWORD_ERROR("3002", "管理员密码错误！"),
    ADMIN_ERROR("3003", "管理员账号或者密码错误"),

    CHAPTER_UPLOAD_ERROR("4001", "章节上传失败"),
    CHAPTER_SELECT_ERROR("4002", "该章节不存在"),
    CHAPTER_NOT_ERROR("4003", "该章节不存在"),
    CHAPTER_MODIFY_ERROR("4004", "修改章节失败"),
    CHAPTER_DELETE_ERROR("4005", "修改章节失败"),

    BOOK_SELECT_ERROR("5001", "查询书籍失败啊老铁！"),
    BOOK_MODIFY_ERROR("5002", "修改书籍失败！"),
    BOOK_DELETE_ERROR("5002", "删除书籍失败！"),
    BOOK_INSERT_ERROR("5003", "增加书籍失败！");

    private String code;
    private String message;

    private ResultCode(String code, String message){
        this.code = code;
        this.message = message;
    }
    public String code(){
        return this.code;
    }
    public String message(){
        return this.message;
    }


}
