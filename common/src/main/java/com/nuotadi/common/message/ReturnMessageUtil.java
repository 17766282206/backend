package com.nuotadi.common.message;

import com.nuotadi.common.enums.CodeEnum;

/**
 * @program: myp
 * @description
 * @author: YouName
 * @create: 2019-12-12 17:11
 **/
public class ReturnMessageUtil {
    /**
     * layui返回格式无异常 请求成功并有具体内容返回
     * @param object
     * @return
     */
    public static ReturnMessage<Object> sucess(Object object) {
        ReturnMessage<Object> message = new ReturnMessage<Object>(0,"success",object);
        return message;
    }

    /**
     * 无异常 请求成功并有具体内容返回
     * @param object
     * @return
     */
    public static ReturnMessage<Object> sucess(Object object, int count) {
        ReturnMessage<Object> message = new ReturnMessage<Object>(0,"success",count,object);
        return message;
    }

    /**
     * layui返回格式无异常 请求成功并有具体内容返回带分页
     * @param object
     * @return
     */
    public static ReturnMessage<Object> sucess(Object object, int count, int total) {
        ReturnMessage<Object> message = new ReturnMessage<Object>(0, total, "success",count,object);
        return message;
    }

    /**
     * 无异常 请求成功并无具体内容返回
     * @return
     */
    public static ReturnMessage<Object> sucess() {
        ReturnMessage<Object> message = new ReturnMessage<Object>(0, "success",null);
        return message;
    }

    /**
     * 有自定义错误异常信息
     * @param code
     * @param msg
     * @return
     */
    public static ReturnMessage<Object> error(Integer code,String msg) {
        ReturnMessage<Object> message = new ReturnMessage<Object>(code,msg,null);
        return message;
    }

    public static ReturnMessage<Object> error(CodeEnum codeEnum) {
        ReturnMessage<Object> message = new ReturnMessage<Object>(codeEnum.getCode(),codeEnum.getMsg(),null);
        return message;
    }


    public static ReturnMessage<Object> error(CodeEnum codeEnum, Object data) {
        ReturnMessage<Object> message = new ReturnMessage<Object>(codeEnum.getCode(),codeEnum.getMsg(),data);
        return message;
    }
}
