package com.numbers;
/*
Perfect number is a positive integer
that is equal to the sum of its proper
positive divisors, excluding the number itself
 */
public class IsPerfectNumber {
    public static void main(String a[]) {
        IsPerfectNumber ipn = new IsPerfectNumber();
        System.out.println("Is perfect number: " + ipn.isPerfectNumber(28));
    }

    private boolean isPerfectNumber(int number) {
        int temp = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                temp += i;
                System.out.println(i);
            }
        }
        return temp == number;
    }
}