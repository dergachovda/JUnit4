package com.test.unit;

import java.util.Scanner;

public class SimpleCalculatorApp {
    public static void main(String[] args) throws Exception {

        System.out.println("Input:");

        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(" ");

        if (input.length < 3) {
            throw new Exception("Invalid input");
        }

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[2]);
        Operation operation = Operation.parse(input[1]);

        Calculator calc = new SimpleCalculator();

        int result = calc.calculate(a, operation, b);

        System.out.println(result);

    }
}
