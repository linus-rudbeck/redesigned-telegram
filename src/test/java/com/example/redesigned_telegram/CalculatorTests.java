package com.example.redesigned_telegram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    public void testAdd(){
        int result = Calculator.add(4, 5);
        Assertions.assertEquals(9, result);
    }

    @Test
    public void testSubtract(){
        int result = Calculator.subtract(5, 4);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testMultiply(){
        int result = Calculator.multiply(5, 4);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void testDivide(){
        int result = Calculator.divide(100, 5);
        Assertions.assertEquals(20, result);
    }
}
