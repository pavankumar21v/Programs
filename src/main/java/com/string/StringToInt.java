package com.string;

public class StringToInt {

    public static int toNum(String numStr) {

        char ch[] = numStr.toCharArray();
        int sum = 0;

        int zeroAscii = (int) '0';
        System.out.println("Zero Ascii " + zeroAscii);

        for (char c : ch) {
            int tmpAscii = (int) c;
            System.out.println("Ascii of " + c + " " + tmpAscii);
            sum = (sum * 10) + (tmpAscii - zeroAscii);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(toNum("123"));
        //System.out.println(Integer.valueOf("123"));
    }
}
