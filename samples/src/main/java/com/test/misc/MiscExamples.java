package com.test.misc;

/**
 * @Author bhushank
 */
public class MiscExamples {

    public static void main(String[] args) {
        /*System.out.println(fibonacci(7));*/
        System.out.println(isPrime(173));
    }

    private static int fibonacci(int number) {
        if (number <= 1) return number;
        else return number+ fibonacci(number-1);
    }

    private static boolean isPrime(int number) {
        for(int i=2; i<=Math.sqrt(number);i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
