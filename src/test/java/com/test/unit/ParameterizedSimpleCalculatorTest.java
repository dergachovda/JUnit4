package com.test.unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedSimpleCalculatorTest {

    private int a;
    private Operation operation;
    private int b;
    private int expected;

    public ParameterizedSimpleCalculatorTest(int a, Operation operation, int b, int expected) {
        this.a = a;
        this.operation = operation;
        this.b = b;
        this.expected = expected;
    }

    @Parameters(name = "{index}: {0} {1} {2} = {3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, Operation.DIV, 1, 0 },
                { 2, Operation.DIV, 2, 1 },
                { 1, Operation.SUM, 1, 2 },
                { 2, Operation.SUM, 1, 3 },
                { 0, Operation.DIFF, 1, -1 },
                { 3, Operation.DIFF, 2, 1 },
                { 0, Operation.MULT, 1, 0 },
                { 1, Operation.MULT, 1, 1 },
                { 2, Operation.MULT, 2, 4 },
        });
    }

    @Test
    public void test() {
        assertEquals(
                expected,
                new SimpleCalculator().calculate(a, operation, b)
        );
    }

}