package com.kodilla.testing.calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 5;
        int b = 3;

        int additionResult = calculator.add(a, b);
        int subtractionResult = calculator.subtract(a, b);

        System.out.println("Wynik dodawania: " + additionResult);
        System.out.println("Wynik odejmowania: " + subtractionResult);
    }
}

