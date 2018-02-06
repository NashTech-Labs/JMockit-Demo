package com.knoldus.example;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;
import static org.junit.Assert.*;

public class StaticBlockDemoTest {
    /**
     * Test for static block
     */
    @Test
    public void testBankStaticBlock() {

        new MockUp<StaticBlockDemo>() {

            @SuppressWarnings("unused")
            @Mock
            public void $clinit() {
                StaticBlockDemo.updateBalance(500);
            }
        };

        assertEquals("The balance amount is 500",
                500, StaticBlockDemo.balanceAmount);
    }

}
