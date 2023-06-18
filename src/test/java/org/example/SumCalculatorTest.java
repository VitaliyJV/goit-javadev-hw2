package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {
    SumCalculator calculator;

    @BeforeEach
    void createClassInstance() {
        calculator = new SumCalculator();
    }

    @Test
    void sum1() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    void sum3() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    void sum0() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));

    }

}

