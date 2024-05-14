package com.academy.homework_ten;

import com.academy.homework_ten.my_anotation.MyAnnotationHW;
import com.academy.homework_ten.my_anotation.Student;


public class Main {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();


        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Ответ = " + i);
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();



    }
}
