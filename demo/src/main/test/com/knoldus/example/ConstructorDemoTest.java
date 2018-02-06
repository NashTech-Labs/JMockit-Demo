package com.knoldus.example;

import mockit.Mock;
import mockit.MockUp;
import mockit.Tested;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorDemoTest {

    @Tested
    ConstructorDemo constructorDemo;

    /**
     * Test for mocking constructor
     */
    @Test
    public void testGetName() {
        new MockUp<ConstructorDemo>() {
            @Mock
            public void $init() {
            }
        };
        String name = constructorDemo.getName();
        assertNull("Name of person is null", name);
    }

}
