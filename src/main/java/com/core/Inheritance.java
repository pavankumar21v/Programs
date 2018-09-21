package com.core;

/* Child can access parent data and methods but not vice versa */
public class Inheritance {
}

class A {
    private String msg = "Pavan";

    public static void main(String args[]) {
        A a = new A();
        B b = a.new B();

        b.run();
        a = b;
        a.run();
    }

    private void run() {
        System.out.println("A " + msg);
    }

    class B extends A {
        private void run() {
            System.out.println("B " + msg);
        }
    }
}