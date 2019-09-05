package com.test.unit;

public class SimpleCalculator implements Calculator {
    @Override
    public int calculate(int a, Operation o, int b) {
        int result;
        switch (o) {
            case SUM:
                result = a + b;
                break;
            case DIFF:
                result = a - b;
                break;
            case MULT:
                result = a * b;
                break;
            case DIV:
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Unknown operation");
        }
        return result;
    }
}
