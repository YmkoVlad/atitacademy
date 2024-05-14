package com.academy.homework_ten.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Example {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeClass1 = Class.forName("com.academy.homework_ten.Reflection.Employee");
//        Class employeClass2 = Employee.class;
//        Employee employee = new Employee();
//        Class employeClass3 = employee.getClass();


        Field someField = employeClass1.getField("id");
        System.out.println("Type of id field = " + someField.getType());
        System.out.println("============================================");

        Field[] fields = employeClass1.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("============================================");

        Field[] allFierlds = employeClass1.getDeclaredFields();
        for (Field field : allFierlds) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("============================================");

        Method someMethod1 = employeClass1.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = "
                + someMethod1.getReturnType() + ", parameter types = "
                + Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("============================================");

        Method someMethod2 = employeClass1.getMethod("setSalary", double.class);
        System.out.println("Return type of method increaseSalary = "
                + someMethod2.getReturnType() + ", parameter types = "
                + Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("============================================");

        Method[] methods = employeClass1.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName()
                    + ", return type = " + method.getReturnType()
                    + ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("============================================");

        Method[] allMethods = employeClass1.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Name of method = " + method.getName()
                    + ", return type = " + method.getReturnType()
                    + ", parameter types = " + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("============================================");

        Method[] allMethods2 = employeClass1.getDeclaredMethods();
        for (Method method : allMethods2) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of method = " + method.getName()
                        + ", return type = " + method.getReturnType()
                        + ", parameter types = " + Arrays.toString(method.getParameterTypes()));
            }
        }
        System.out.println("============================================");

        Constructor constructor1 = employeClass1.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount()
                + " parameters, their types are : " + Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("============================================");

        Constructor constructor2 = employeClass1.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount()
                + " parameters, their types are : " + Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("============================================");

        Constructor[] constructors = employeClass1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor " + constructor.getName()
                    + " has " + constructor.getParameterCount()
                    + " parameters, their types are : " + Arrays.toString(constructor.getParameterTypes()));
        }


    }
}