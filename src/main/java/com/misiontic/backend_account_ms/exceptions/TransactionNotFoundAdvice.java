package com.misiontic.backend_account_ms.exceptions;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody

public class TransactionNotFoundAdvice {

    /** Sirve para activar el body de la respuesta */
    @ResponseBody

    /** Cuando ocurra un error se activa este metodo en la respectiva clase*/
    @ExceptionHandler(TransactionNotFoundException.class)

    /** Codigo de respuesta HTTP*/
    @ResponseStatus(HttpStatus.NOT_FOUND)

    String TransactionNotFoundAdvice(TransactionNotFoundException ex){

        return ex.getMessage();

    }
}
