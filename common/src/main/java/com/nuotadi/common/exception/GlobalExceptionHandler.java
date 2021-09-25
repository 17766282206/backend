package com.nuotadi.common.exception;


import com.nuotadi.common.enums.CodeEnum;
import com.nuotadi.common.message.ReturnMessage;
import com.nuotadi.common.message.ReturnMessageUtil;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.ui.Model;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.sql.SQLException;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 500 - Bad Request
     */
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class,
                       HttpMediaTypeNotSupportedException.class,
                       SQLException.class})
    public String handleHttpMessageNotReadableException(HttpServletRequest request,
                                                              HttpServletResponse response,
                                                              Exception e){
        e.printStackTrace();
        return "error/500";
    }
//
//    @ExceptionHandler(UnauthorizedException.class)
//    public ModelAndView resolveException(HttpServletRequest request,
//                                         HttpServletResponse response,
//                                         UnauthorizedException unauthorizedException) {
//        if (ToolUtil.isAjax(request)) {
//            try {
//                response.setContentType("application/json;charset=UTF-8");
//                PrintWriter writer = response.getWriter();
//                RestResponse failResponse = RestResponse.failure("您无此权限,请联系管理员!");
//                writer.write(JSONObject.toJSONString(failResponse));
//                writer.flush();
//                writer.close();
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            }
//        }else {
//            RestResponse restResponse = RestResponse.failure(unauthorizedException.getMessage());
//            return new ModelAndView("admin/error/500",restResponse);
//        }
//
//        return null;
//    }
//
//    /**
//     * 404的拦截.
//     * @param request
//     * @param response
//     * @param ex
//     * @return
//     * @throws Exception
//     */
//    @ResponseStatus(code = HttpStatus.NOT_FOUND)
//    @ExceptionHandler(NoHandlerFoundException.class)
//    public String notFound(HttpServletRequest request, HttpServletResponse response, Exception ex, Model model) {
//        model.addAttribute("url",request.getRequestURI());
//        return "admin/error/404";
//    }
//
//    @ExceptionHandler(MyException.class)
//    public String myException(HttpServletRequest request, HttpServletResponse response, MyException ex, Model model) {
//        if(ex.getCode() == 404){
//            model.addAttribute("url",request.getRequestURI());
//            return "admin/error/404";
//        }else{
//            RestResponse restResponse = RestResponse.failure(ex.getMessage());
//            model.addAttribute("url",restResponse);
//            return "admin/error/500";
//        }
//    }

    @ExceptionHandler(ApiException.class)
    @ResponseBody
    public ReturnMessage<Object> apiException(ApiException e) {
        return ReturnMessageUtil.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public ReturnMessage<Object> HttpMessageNotReadableException(HttpMessageNotReadableException e) {
        return ReturnMessageUtil.error(CodeEnum.JSON_PAESE_ERROR);
    }

}
