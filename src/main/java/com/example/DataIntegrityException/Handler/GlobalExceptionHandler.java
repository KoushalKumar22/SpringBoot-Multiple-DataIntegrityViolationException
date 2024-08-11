package com.example.DataIntegrityException.Handler;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Object> handleDataIntegrityException(DataIntegrityViolationException exception){
        String errorMessage="DataBase Error Occurred!";
        if (exception.getMessage().contains("(user_name)")){
            errorMessage="Username Already Taken!";
        } else if (exception.getMessage().contains("(phone_no)")) {
            errorMessage="Phone No Already Exist";
        }
        else if (exception.getMessage().contains("(account_no)")){
            errorMessage="account no already exist";
        }
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}
