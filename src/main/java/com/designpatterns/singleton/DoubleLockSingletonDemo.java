package com.designpatterns.singleton;

class DoubleLockSingleton {
    private static DoubleLockSingleton instance = null;
    private DoubleLockSingleton() {}

    public static DoubleLockSingleton getInstance() {
        if(instance == null)
            instance = new DoubleLockSingleton();

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
