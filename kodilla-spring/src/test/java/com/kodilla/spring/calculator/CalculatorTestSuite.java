package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    public void testCalculations() {
        // Given
        // When, Then
        assertEquals(5.0, calculator.add(2, 3));
        assertEquals(-1.0, calculator.sub(2, 3));
        assertEquals(6.0, calculator.mul(2, 3));
        assertEquals(2.0, calculator.div(6, 3));
    }
}