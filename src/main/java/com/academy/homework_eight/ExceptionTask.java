package com.academy.homework_eight;

import java.io.FileNotFoundException;
import java.io.FileReader;


//task2 Поменял на Exception
public class ExceptionTask extends Exception {

    //public class ExceptionTask extends RuntimeException {
//    Task.1 Создайте класс-исключение и наследуйте RuntimeException.
//    Выбросьте исключение при помощи throw и убедитесь что приложение упадет

//    public static void main(String[] args) {
//        exceptionTask(7);
//    }
//    public static void exceptionTask(int a) {
//        if (a > 5) {
//            throw new RuntimeException("Error RuntimeException");
//        }
//    }


    //Task2-3 сделал в try-catch - по примеру исключений который смотрели на занятии
    public static void main(String[] args)  {

        exceptionTaskThree(7);

    }

    public static void exceptionTaskThree(int a)  {
        if (a > 5);
        try {
            FileReader fileReader = new FileReader("Text.txt");
            throw new Exception("Hello Exception");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
