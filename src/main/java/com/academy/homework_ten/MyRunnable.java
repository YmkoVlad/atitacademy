package com.academy.homework_ten;

public class MyRunnable implements Runnable{

    public void run()  {
        try {
            testOne();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void testOne() throws InterruptedException {
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            System.out.println("Next line");
            Thread.sleep(1000);
        }
    }
}
