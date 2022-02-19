package com.misiontic.backend_account_ms.controllers;

import com.misiontic.backend_account_ms.models.Account;

import com.misiontic.backend_account_ms.repositories.AccountRepository;

import com.misiontic.backend_account_ms.exceptions.AccountNotFoundException;

import org.springframework.web.bind.annotation.*;

@RestController

public class AccountController {

    private final AccountRepository accountRepository;

    /** Llama al repositorio que tiene que llamar y le inyecta esa dependencia */
    public AccountController(AccountRepository accountRepository) {

        this.accountRepository = accountRepository;
    }

    /** Microservicios */

    @GetMapping("/")
    String messageRoot(){
        return "Bienvenido a AccountMS";
    }

    /** Porque el repositorio usa un map en la interfaz debemos usar un Mapping en el microservicio*/
    /** Se le pasa como parametro el endpoint y llama el metodo*/
    @GetMapping("/accounts/{username}")

    /** Se usa el PathVaraible para indicarle que lo que se paso en el endpoint como parametro se guarde en esta variable */
    Account getAccount(@PathVariable String username){

        /** Le dicemos que me traiga por el id del username que definimos en los modelos con sus respectivos campos*/
        return accountRepository.findById(username)

                /** Se hace el manejo del error */
                .orElseThrow(() -> new AccountNotFoundException("No se encontro una cuenta con el username: " + username));
    }

    @PostMapping("/accounts")

    /** Como el metodo es POST la informacion viene en el body*/
    Account newAccount(@RequestBody Account account){

        /** Si no encientra un error guarda la peticion */
        return accountRepository.save(account);

    }

}
