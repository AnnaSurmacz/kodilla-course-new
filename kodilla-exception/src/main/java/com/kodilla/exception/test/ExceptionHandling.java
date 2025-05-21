package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge sc = new SecondChallenge();
        try {
            String result = sc.probablyIWillThrowException(1.5, 4);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception was caught: " + e);
        } finally {
            System.out.println("Always here!");
        }
    }
}