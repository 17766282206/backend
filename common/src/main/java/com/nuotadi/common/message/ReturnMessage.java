package com.nuotadi.common.message;

import java.io.Serializable;

/**
 * @program: myp
 * @description
 * @author: YouName
 * @create: 2019-12-12 17:12
 **/
public class ReturnMessage<T> implements Serializable {

    private Integer rescode;//错误码
    private String message;//提示信息
    private Integer count;//表格总条数
    private Integer total;
    private T data;//返回具体内容

    public ReturnMessage(Integer code, String message) {
        super();
        this.rescode = code;
        this.message = message;

    }
    public ReturnMessage(Integer code, String message, T data) {
        super();
        this.rescode = code;
        this.message = message;
        this.data = data;
    }

    public ReturnMessage(Integer code, String message, Integer count, T data) {
        super();
        this.rescode = code;
        this.message = message;
        this.data = data;
        this.count = count;
    }


    public ReturnMessage(Integer code,Integer total, String message, Integer count, T data) {
        super();
        this.rescode = code;
        this.total = total;
        this.message = message;
        this.data = data;
        this.count = count;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCode() {
        return rescode;
    }
    public void setCode(Integer code) {
        this.rescode = code;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
