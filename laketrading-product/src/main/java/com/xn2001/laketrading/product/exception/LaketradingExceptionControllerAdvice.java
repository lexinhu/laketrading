package com.xn2001.laketrading.product.exception;

import com.xn2001.common.exception.BizCodeEnum;
import com.xn2001.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

/**
 * @author 乐心湖
 * @date 2020/9/16 16:51
 * 集中处理所有异常
 **/
@Slf4j
@RestControllerAdvice(basePackages = "com.xn2001.laketrading.product.controller")
public class LaketradingExceptionControllerAdvice {

    //数据校验异常处理
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        HashMap<String, String> errorMap = new HashMap<>();
        //遍历出所有的的错误校验信息，添加到errorMap中去。
        bindingResult.getFieldErrors().forEach((fieldError -> {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        }));
        log.error("数据校验出现问题{},异常类型,{}", e.getMessage(), e.getClass());
        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(), BizCodeEnum.VALID_EXCEPTION.getMsg()).put("data", errorMap);
    }

    @ExceptionHandler(Throwable.class)
    public R handleException(Throwable throwable) {
        return R.error(BizCodeEnum.UNKNOWN_EXCEPTION.getCode(), BizCodeEnum.UNKNOWN_EXCEPTION.getMsg());
    }

}

