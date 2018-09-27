package com.core;

class Parent {
     void fun() {
        System.out.println("A.fun()");
    }

    static void fun1() {
        System.out.println("A.fun1()");
    }
}

class Child extends Parent {
     @Override
     void fun() {
        System.out.println("B.fun()");
    }
}

public class StaticMethodHiding {
    public static void main(String args[]) {
        Parent a = new Child();
        a.fun(); //Child
        a.fun1(); //Parent static
    }
}

