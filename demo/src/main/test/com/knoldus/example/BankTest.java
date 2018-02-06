package com.knoldus.example;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mock;
import mockit.MockUp;
import mockit.Tested;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {

    @Tested
    Bank bank;

    //@Mocked
    @Injectable
    DBManager dbManager;

    /**
     * Test for public method using MockUp
     */
    @Test
    public void testBankProcessAccount() {

        new MockUp<DBManager>() {

            @SuppressWarnings("unused")
            @Mock
            public String retrieveAccountHolderName(int accountId) {
                return "Ruhani";
            }
        };
        //String name = bank.processAccount(11);
        //String name = bank.processAccount(9);
        String name = bank.processAccount(10);

         assertEquals("Account holder Name for A/C id is not 'Ruhani' ",
                "Ruhani", name);
         /*assertEquals("Account holder Name for A/C id is not 'Ruhani' ",
                "holder", name);*/
    }

    /**
     * Test for public method using Expectations
     */
    @Test
    public void testRetrieveAccountHolderName() {
        new Expectations() {
            {
                dbManager.retrieveAccountHolderName(10);
                result = "Jasmine";
                //times = 2;
                //times = 3;
                //maxTimes = 3;
            }
        };

        String name = bank.processAccount(10);
        //String name = bank.processAccount(11);
        //String name = bank.processAccount(9);

        assertEquals("Account holder Name for A/C id 10 is not 'Jasmine' ",
                "Jasmine", name);

    }

    /**
     * Test for public method using Expectations
     */
    @Test
    public void testRetrieveAccountHolderBalance() {
        new Expectations() {
            {
                dbManager.retrieveAccountHolderNameAgain(11);
                result = "Jasmine";
            }
        };

        String name = bank.processAccount(11);

        assertEquals("Account holder Balance for A/C id 10 is not 'Jasmine' ",
                "Jasmine", name);

    }
}
