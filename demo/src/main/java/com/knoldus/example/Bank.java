package com.knoldus.example;

import com.google.inject.Inject;

public class Bank {

    private DBManager dbManager;

    @Inject
    public Bank(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    public String processAccount(int accountID) {

        String accountHolderName;
        if (accountID <= 10) {
            accountHolderName = dbManager.retrieveAccountHolderName(accountID);
           // String accountHolderName2 = dbManager.retrieveAccountHolderName(accountID);

        } else {
            accountHolderName = dbManager.retrieveAccountHolderNameAgain(accountID);
        }
        return accountHolderName;

    }

}
