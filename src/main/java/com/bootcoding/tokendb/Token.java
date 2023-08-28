package com.bootcoding.tokendb;

import java.util.Date;

public class Token {
    int id;
   int token_id;
    int counter_id;
    Date timestamp;

    public int getToken_id() {
        return token_id;
    }

    public void setToken_id(int token_id) {
        this.token_id = token_id;
    }

    public int getCounter_id() {
        return counter_id;
    }

    public void setCounter_id(int counter_id) {
        this.counter_id = counter_id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
