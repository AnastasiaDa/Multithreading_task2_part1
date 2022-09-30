package com.company;

import java.util.concurrent.Callable;

public class MyCallable extends Thread implements Callable {

    @Override
    public Object call() {
        int num = 0;
        try {
            while (num < 4) {
                System.out.println("Hello! I am " + Thread.currentThread().getName());
                num++;
                Thread.sleep(2500);
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.println("I showed the message " + Thread.currentThread().getName() + " " + num + " times");
        }
        return num;
    }
}
