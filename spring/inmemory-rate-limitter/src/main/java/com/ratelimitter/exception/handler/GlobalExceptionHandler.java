package com.ratelimitter.exception.handler;


import com.ratelimitter.exception.TooManyRequestsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TooManyRequestsException.class)
    @ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
    public Map<String,String> handleTooManyRequestsException(TooManyRequestsException exception) {
        Map<String,String> errorResponse = new HashMap<>();
        errorResponse.put("message",exception.getMessage());
        return  errorResponse;
    }
}
