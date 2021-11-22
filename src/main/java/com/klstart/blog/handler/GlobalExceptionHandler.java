package com.klstart.blog.handler;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolationException;
import java.sql.SQLException;

/**
 * @author KLStart
 * @since 2021/11/22 15:01
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(BindException.class)
    public String bindExceptionHandler(final BindException e) {
        return "";
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(ConstraintViolationException.class)
    public String violationExceptionHandler(final ConstraintViolationException e) {
        return "";
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String methodArgumentNotValidException(final MethodArgumentNotValidException e) {
        return "";
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(CustomException.class)
    public String customExceptionHandler(final CustomException e) {
        return "";
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(SQLException.class)
    public String sqlException(final SQLException e) {
        return "";
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(NullPointerException.class)
    public String nullPointerException(final NullPointerException e) {
        return "";
    }

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(NumberFormatException.class)
    public String numberFormatException(final NumberFormatException e) {
        return "";
    }

}
