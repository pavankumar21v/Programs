package com.thread;

import java.util.LinkedList;

import static java.lang.Thread.sleep;
import static javafx.application.Platform.exit;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        final PC pc = new PC();

        Thread t1 = new Thread(() -> {
            try {
                pc.produce();
                return;
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

        t1.join();
        t2.join();
    }

    public static class PC {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;
        int flag = 1;

        void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {
                    while (list.size() == capacity || flag == 0) wait();

                    if (value == 3) System.exit(0);
                    System.out.println("Producer produced-" + value);
                    list.add(value++);
                    flag = 0;

                    notify();
                    sleep(2000);
                }
            }
        }

        void consume() throws InterruptedException {
            int i = 0;
            while (i <= 10) {
                synchronized (this) {
                    while (list.size() == 0) wait();

                    System.out.println("Consumer consumed-" + list.removeFirst());
                    notify();
                    flag = 1;
                    sleep(4000);
                }
                i++;
            }
        }
    }
}