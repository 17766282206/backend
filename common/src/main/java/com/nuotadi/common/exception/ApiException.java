package com.nuotadi.common.exception;

import com.nuotadi.common.enums.CodeEnum;

/**
 * @program: myp
 * @description
 * @author: zhoudi
 * @create: 2020-03-18 17:05
 **/
public class ApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    private Integer code;

    public ApiException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public ApiException(CodeEnum codeEnum) {
        super(codeEnum.getMsg());
        this.code = codeEnum.getCode();
    }

}
