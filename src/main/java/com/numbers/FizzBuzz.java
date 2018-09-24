package com.numbers;
/*
Multiples of 3 print Fizz
Multiples of 5 print Buzz
Multiples of 3 & 5 print FizzBuzz
 */
class FizzBuzz {
    public static void main(String args[]) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }
    }
}