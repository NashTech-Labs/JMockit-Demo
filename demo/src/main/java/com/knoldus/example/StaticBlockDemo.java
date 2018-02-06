package com.knoldus.example;

public class StaticBlockDemo {

    static int balanceAmount;

    //Static block begins
    static {
        updateBalance(100);
    }

    public static void updateBalance(float balance) {
        balanceAmount += balance;
    }

}
