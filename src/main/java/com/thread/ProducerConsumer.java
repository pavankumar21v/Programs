package com.thread;

import java.util.LinkedList;

import static java.lang.Thread.sleep;
import static javafx.application.Platform.exit;

public class ProducerConsumer {
    public static void main(String[] args) {
        final PC pc = new PC();

        Thread t1 = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                pc.consume();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}

class PC {
    private LinkedList<Integer> list = new LinkedList<>();
   // private int flag = 1;

    void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                int capacity = 2;
               // while (list.size() == capacity || flag == 0) wait();
                while (list.size() == capacity) wait();
                System.out.println("Producer produced-" + value);
                list.add(value++);
               // flag = 0;

                notify();
                sleep(2000);
            }
        }
    }

    void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.size() == 0) wait();

                System.out.println("Consumer consumed-" + list.removeFirst());
                notify();
               // flag = 1;
                sleep(4000);
            }
            //i++;
        }
    }
}