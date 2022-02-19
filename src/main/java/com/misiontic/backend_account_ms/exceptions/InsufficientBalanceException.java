package com.misiontic.backend_account_ms.exceptions;

public class InsufficientBalanceException extends RuntimeException {

    /** Se encarga de manejar el error a nivel de codigo*/
    public InsufficientBalanceException(String message) {

        super(message);

    }

}