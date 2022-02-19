package com.misiontic.backend_account_ms.models;
import org.springframework.data.annotation.Id;
import java.util.Date;

public class Transaction {

    @Id
    private String id;
    private String usernameOrigin;
    private String usernameDestiny;
    private Integer value;
    private Date date;

    public Transaction(String id, String usernameOrigin, String usernameDestiny, Integer value, Date date) {

        this.setId(id);
        this.setUsernameOrigin(usernameOrigin);
        this.setUsernameDestiny(usernameDestiny);
        this.setValue(value);
        this.setDate(date);

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsernameOrigin() {
        return usernameOrigin;
    }

    public void setUsernameOrigin(String usernameOrigin) {
        this.usernameOrigin = usernameOrigin;
    }

    public String getUsernameDestiny() {
        return usernameDestiny;
    }

    public void setUsernameDestiny(String usernameDestiny) {
        this.usernameDestiny = usernameDestiny;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}