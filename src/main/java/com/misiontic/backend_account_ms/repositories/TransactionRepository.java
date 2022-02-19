package com.misiontic.backend_account_ms.repositories;

import com.misiontic.backend_account_ms.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface TransactionRepository extends MongoRepository<Transaction, String> {

    /* Metodos abstractos -> Si quiero traer todas las transacciones por cuenta de origen recibe los parametros y me devuelve una lista de las transacciones*/
    /* Serian las dos llaves foraneas del modelo */
    List<Transaction> findByUsernameOrigin (String usernameOrigin);

    List<Transaction> findByUsernameDestiny (String usernameDestiny);

}