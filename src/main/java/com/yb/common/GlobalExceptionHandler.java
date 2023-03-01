package com.yb.common;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yangsong
 * @version 1.0
 * @date 2022/11/1 11:50
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public R<String> exceptionHandler(HttpServletRequest request, Exception e) {
        return R.error("医保加密服务系统异常");

    }
}