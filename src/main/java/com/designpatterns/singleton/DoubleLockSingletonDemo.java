package com.designpatterns.singleton;

class DoubleLockSingleton {
    private static volatile DoubleLockSingleton instance;
    private DoubleLockSingleton() {}

    public static DoubleLockSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleLockSingleton.class) {
                if(instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }

        return instance;
    }

    public void display() {
        System.out.println("Double Lock Singleton");
    }
}

public class DoubleLockSingletonDemo {
    public static void main(String[] args) {
        DoubleLockSingleton doubleLockSingleton = DoubleLockSingleton.getInstance();
        doubleLockSingleton.display();
    }
}
