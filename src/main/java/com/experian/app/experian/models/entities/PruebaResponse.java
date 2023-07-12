package com.experian.app.experian.models.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PruebaResponse {

    @Id
    private String returnValue;

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }
}
