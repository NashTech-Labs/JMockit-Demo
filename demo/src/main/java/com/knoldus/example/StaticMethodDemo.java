package com.knoldus.example;

public class StaticMethodDemo {

    public String makeConnection(){
        // call to static method
        String conStr = StaticMethodOriginal.getConnectionString();

        if(conStr.equals("ORIGINAL"))
            return "SUCCESS";
        else
            return "FAIL";
    }

}
