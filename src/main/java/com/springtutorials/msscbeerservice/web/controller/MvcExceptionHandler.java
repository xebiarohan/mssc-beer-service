package com.springtutorials.msscbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> handleException(ConstraintViolationException e) {
        List<String> errors = new ArrayList(e.getConstraintViolations());

        e.getConstraintViolations().forEach(constraintViolation ->
            errors.add(constraintViolation.toString()));

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
