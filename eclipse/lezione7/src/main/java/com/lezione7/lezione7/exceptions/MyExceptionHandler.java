package com.lezione7.lezione7.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(EntityExistsException.class)
    protected ResponseEntity<String> manageEntityExistsException(EntityExistsException e){
        return new ResponseEntity<String>(e.getMessage()+ " -MyExceptionHandler",HttpStatus.FOUND);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity<String> manageEntityNotFoundException(EntityNotFoundException e){
        return new ResponseEntity<String>(e.getMessage()+ " -MyExceptionHandler",HttpStatus.FOUND);
    }

}
