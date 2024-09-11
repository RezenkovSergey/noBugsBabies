package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
         System.out.println(sum(1, 5));
         System.out.println(diff(5, 1));
    }

    private static int sum(int firstSummand, int secondSummand) {
        return firstSummand + secondSummand;
    }

    private static int diff(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }
}