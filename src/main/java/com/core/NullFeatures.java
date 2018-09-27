package com.core;

public class NullFeatures {
    private static Object obj;

    public static void main(String[] args) {
        //Object obj = NULL; Case sensitive
        Object obj1 = null;

        //Reference variable has null as default value
        System.out.println("Reference " + obj);

        Integer i = null;
        //Unboxing null to integer throws NullpointerException
        //int a = i;

        System.out.println(i instanceof Integer); //false
        //obj.staticMethod(); calls the static method due to class binding
    }
}
