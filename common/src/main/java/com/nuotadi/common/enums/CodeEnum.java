package com.nuotadi.common.enums;

/**
 * @program: myp
 * @description
 * @author: YouName
 * @create: 2019-12-12 17:13
 **/
public enum CodeEnum {

    SUCCESS(0, "success"),

    UPDATE_ERROR(201, "更新失败"),

    SAVE_ERROR(202, "保存失败"),

    RESOURCES_NOT_EXISTS(404,"资源不存在"),

    PARAM_IS_NULL(4000,"请求参数为空"),

    USER_IS_NULL(4001,"用户不存在"),

    PASSWORD_ERROR(4002,"密码不正确"),

    TELEPHONE_EXISTS(4003,"手机号已注册"),

    USERNAME_EXISTS(4004,"用户名重复"),

    TELEPHONE_CODE_ERROR(4005, "验证码错误"),

    TELEPHONE_CODE_TIMEOUT(4006,"验证码超时"),

    OLD_PASSWORD_ERROR(4007, "旧密码错误"),

    TELEPHONE_NOT_REGISTER(4008, "手机号未注册，请先注册。"),

    TOKEN_EXCEPTION(5000, "token异常"),

    TOKEN_UNSUPPORTED(5001, "token无效"),

    TOKEN_MALFORMED(5002, "token格式错误"),

    TOKEN_SIGNATURE(5003, "token签名无效"),

    TOKEN_ILLEGALARGUMENT(5004, "token参数异常"),

    TOKEN_EXPIRED(5005, "token已过期"),

    JSON_PAESE_ERROR(6000,"JSON格式错误"),

    WXUSERINFO_SAVE_ERROR(6100, "插入微信用户信息表失败"),

    WXUSERINFO_UPDATE_ERROR(6101, "更新微信用户信息表失败"),

    NOT_PERMISSION(7000,"无权限访问"),

    COMPANY_EXISTS(8000,"单位已存在"),

    DICT_INDEX_EXISTS(9000, "字典索引已存在"),

    UNKNOWN_ERROR(9999, "未知错误");




    private CodeEnum(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
