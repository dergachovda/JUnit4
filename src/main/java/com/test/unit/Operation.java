package com.test.unit;

public enum Operation {

    SUM("+"),
    DIFF("-"),
    MULT("*"),
    DIV("/");

    private final String value;

    Operation(String s) {
        value = s;
    }

    static Operation parse(String s) throws Exception {
        switch (s) {
            case "+":
                return Operation.SUM;
            case "-":
                return Operation.DIFF;
            case "*":
                return Operation.MULT;
            case "/":
                return Operation.DIV;
        }
        throw new Exception("It's not an Operation");
    }

    @Override
    public String toString() {
        return value;
    }
}
