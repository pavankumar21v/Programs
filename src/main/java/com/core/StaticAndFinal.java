package com.core;

public class StaticAndFinal {
    private static int static_var = 10;
    private static final int static_final_var = 10;

    public static void main(String[] args) {
        int x = 0; //For non final
        if(static_var == 10) x = static_var;
        System.out.println("X " + x);

        int k;
        if(static_final_var == 10) k = static_final_var;
        System.out.println("K " + k);


    }
}
