package com.core;

public class Static {
    static int i = 9;

    static {
        System.out.println("STATIC BLOCK");
        Static.disp();
        System.out.println("STATIC VARIABLE " + Static.i);
    }

    public static void main(String[] args) {
        int a = 8;
        a = --a + ++a;
        System.out.println("Main " + a);

    }

    static void disp() {
        System.out.println("STATIC METHOD");
    }

}
