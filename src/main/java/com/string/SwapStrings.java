package com.string;

public class SwapStrings {
    public static void main(String[] args) {
        String a = "one";
        String b = "two";
        a = a + b;
        b = a.replace(b, "");
        a = a.replace(b, "");
        System.out.println("REPLACE");
        System.out.println("a == " + a);
        System.out.println("b == " + b);

       /* System.out.println("SUBSTRING");
        a = a + b;
        b = a.substring(0, (a.length() - b.length()));
        a = a.substring(b.length());
        System.out.println("a == " + a);
        System.out.println("b == " + b);*/
    }

}
