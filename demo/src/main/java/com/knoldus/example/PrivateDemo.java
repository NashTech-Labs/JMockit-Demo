package com.knoldus.example;

public class PrivateDemo {

    private String iAmPrivate(){
        return "Private Method";
    }

    public String publicCallsPrivate(){
        return iAmPrivate();
    }

}
