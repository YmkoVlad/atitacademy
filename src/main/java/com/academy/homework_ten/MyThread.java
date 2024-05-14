package com.academy.homework_ten;

public class MyThread extends Thread {

    public void run () {
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
