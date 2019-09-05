package com.test.unit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

    private Calculator calculator;

    @Before
    public void init() {
        calculator = new SimpleCalculator();
    }

    @Test
    public void onePlusOneTest() {
        assertEquals(
                2,
                calculator.calculate(1, Operation.SUM, 1)
        );
    }

//    @Ignore
    @Test(expected = ArithmeticException.class)
    public void divisionByZero() {
        calculator.calculate(1, Operation.DIV, 0);
    }

}