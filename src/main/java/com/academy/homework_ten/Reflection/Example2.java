package com.academy.homework_ten.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        Class employeClass1 = Class.forName("com.academy.homework_ten.Reflection.Employee");

//        Employee o = (Employee) employeClass1.newInstance();
//        System.out.println(o);

        Constructor<Employee> constructor1 = employeClass1.getConstructor();
        Employee emplo1 = constructor1.newInstance();

//        Constructor<Employee> constructor2 = employeClass1.getConstructor(int.class, String.class, String.class);
//        Employee emplo2 = constructor2.newInstance(1, "Petja", "IT");
//        System.out.println(emplo2);

        Constructor constructor3 = employeClass1.getConstructor(int.class, String.class, String.class);
        Object emplo3 = constructor3.newInstance(1, "Petja", "IT");
        System.out.println(emplo3);
        System.out.println("============================================");

        Method method = employeClass1.getMethod("setSalary", double.class);
        method.invoke(emplo3, 100.10);
        System.out.println(emplo3);

    }
}
