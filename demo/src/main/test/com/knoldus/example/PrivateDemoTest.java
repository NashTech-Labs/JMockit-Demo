package com.knoldus.example;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrivateDemoTest {

    /**
     * Test for private methods
     */
    @Test
    public void testPublicInvokesPrivateMockUp() {

        new MockUp<PrivateDemo>() {
            @Mock
            String iAmPrivate() {
                return "MockUp Invoke";
            }

        };

        PrivateDemo privateDemo = new PrivateDemo();

        String actualResponse = privateDemo.publicCallsPrivate();
        assertEquals("String returned - MockUp Invoke",
                "MockUp Invoke", actualResponse);
    }

}
