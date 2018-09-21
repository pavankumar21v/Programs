package com.string;

class CountTheWords {
    public static void main(String[] args) {
        String s = "I am learning Java";
        String[] words = s.trim().split(" ");
        System.out.println("Number of words in the string = " + words.length);

        //Alternate method
        int count = 1;
        char[] charArray = s.toCharArray();
        for (Character c : charArray) {
            if (c.equals(' ')) count++;
        }
        System.out.println("Number of words in the string = " + count);
    }
}