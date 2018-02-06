package com.knoldus.example;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaticMethodDemoTest {
    /**
     * Test for static method
     */
    @Test
    public void testMakeConnectionWithMockUp(){
        new MockUp<StaticMethodOriginal>(){
            @Mock
             String getConnectionString(){
                return "DUPLICATE";
            }
        };

        StaticMethodDemo staticMethodDemo = new StaticMethodDemo();
        String status = staticMethodDemo.makeConnection();

        assertEquals("Status is FAIL","FAIL",status);
    }
}
