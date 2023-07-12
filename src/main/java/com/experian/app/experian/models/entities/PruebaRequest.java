package com.experian.app.experian.models.entities;


import jakarta.persistence.*;

@Entity
public class PruebaRequest {


    @Id
    private String test;
    private String value;


    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
