package com.string;

public class Palindrome {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("TAVAT");
        System.out.println(s.reverse().toString().equals("TAVAT"));

        System.out.println(isPalindrome(s.toString()));
    }

    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
}
