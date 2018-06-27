package com.github.taojintianxia.springbootexample.handler;

import com.github.taojintianxia.springbootexample.constants.response.R;
import com.github.taojintianxia.springbootexample.exception.CustomizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

/**
 * @author Nianjun Sun
 * @date 2018/6/25 18:59
 */

@RestControllerAdvice
public class TestExceptionHandler {

    @ExceptionHandler(CustomizedException.class)
    public R handleRRException(CustomizedException e) {
        R r = new R();
        r.put("code", HttpStatus.INTERNAL_SERVER_ERROR.value());
        r.put("msg", e.getMessage());

        return r;
    }

    @ExceptionHandler(Exception.class)
    public R handleDuplicateKeyException(Exception e) {
        return R.error(e.getLocalizedMessage());
    }

    @ResponseStatus(value = HttpStatus.CONFLICT, reason = "Data integrity violation")
    @ExceptionHandler(SQLException.class)
    public void doNothing() {
    }
}
