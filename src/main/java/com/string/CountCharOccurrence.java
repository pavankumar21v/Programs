package com.string;

public class CountCharOccurrence {
    public static void main(String[] args) {
        String s = "Java is java again java again";
        char c = 'a';
        int count = s.length() - s.replace("a", "").length();
        System.out.println("Count of " + c + " = " + count);
    }
}
