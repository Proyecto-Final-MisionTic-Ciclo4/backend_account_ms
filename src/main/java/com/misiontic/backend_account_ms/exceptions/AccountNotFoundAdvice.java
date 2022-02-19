
package com.misiontic.backend_account_ms.exceptions;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.ResponseStatus;

/** Superpoderres para que pueda dar la respuesta como servicio web*/
@ControllerAdvice

@ResponseBody

public class AccountNotFoundAdvice {

    /** Sirve para activar el body de la respuesta */
    @ResponseBody

    /** Cuando ocurra un error se activa este metodo en la respectiva clase*/
    @ExceptionHandler(AccountNotFoundException.class)

    /** Codigo de respuesta HTTP*/
    @ResponseStatus(HttpStatus.NOT_FOUND)

    String EntityNotFoundAdvice(AccountNotFoundException ex){

        return ex.getMessage();

    }

};

