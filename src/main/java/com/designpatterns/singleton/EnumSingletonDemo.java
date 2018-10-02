package com.designpatterns.singleton;

enum EnumSingleton {
    INSTANCE;

    public void display() {
        System.out.println("ENUM Singleton");
    }
}

public class EnumSingletonDemo {
    public static void main(String[] args) {
        EnumSingleton.INSTANCE.display();
    }
}

