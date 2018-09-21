package com.thread;

public class ExtendThread  extends Thread {

    @Override
    public void run() {
        System.out.println("Thread " + this.getId());
    }

    public static void main(String[] args) {
        ExtendThread ex  = new ExtendThread();
        ex.start();
    }
}
