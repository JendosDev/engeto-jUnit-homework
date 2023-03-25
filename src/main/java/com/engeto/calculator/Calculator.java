package com.engeto.calculator;

import java.util.Scanner;

public class Calculator {

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        if (number2 ==0 ) {
            throw new IllegalArgumentException("Číslo se nedá dělit nulou!");
        }
        return number1 / number2;
    }

    public static double squareRoot(int number1) {
        return Math.sqrt(number1);
    }

    public static double square(int number1) {
        return Math.pow(number1, 2);
    }

    public static double areaOfCircle(double number1) {
        Scanner input = new Scanner(System.in);

        number1 = input.nextDouble();
        input.close();

        return Math.PI * number1 * number1;
    }
}
