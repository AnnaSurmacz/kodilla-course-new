package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        try {
            FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);}
        catch (ArithmeticException e) {
            System.out.println("Dzielenie przez 0 nie jest możliwe!!!" + e);
        }
        finally {
        System.out.println("koniec");
    }

    }
}