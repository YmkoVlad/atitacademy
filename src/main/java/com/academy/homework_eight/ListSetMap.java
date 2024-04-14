package com.academy.homework_eight;

import java.util.*;

public class ListSetMap {
    public static void main(String[] args) {
        //HomeWork 8


        //Task4
        //Студенты
        Student student = new Student("Vasja", "Petrov", 20);
        Student student2 = new Student("Ivan", "Ivanov", 25);
        Student student3 = new Student("Kiril", "Antonov", 30);
        Student student4 = new Student("Petja", "Ivanov", 19);


        //ArrayList
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);

        System.out.println("OutPut ArrayList = " + arrayList.toString());
        System.out.println("ArrayList is empty? = " + arrayList.isEmpty());
        System.out.println("Sudet3 есть? " + arrayList.contains(student3));
        System.out.println("Del Stydent 3 " + arrayList.remove(student3));
        System.out.println("Sudet3 есть? " + arrayList.contains(student3));
        System.out.println("Size ArrayList = " + arrayList.size());


        //HashSet
        Set<Student> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);

        System.out.println("\nOutPut HashSet = " + hashSet.toString());
        System.out.println("Del Student 1 " + hashSet.remove(student));
        System.out.println("OutPut HashSet = " + hashSet.toString());


        //LinkedHashSet
        Set<Student> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(student);
        linkedHashSet.add(student2);
        linkedHashSet.add(student3);
        linkedHashSet.add(student4);

        System.out.println("\nLinkedHashSet = " + linkedHashSet.toString());
        System.out.println("Del student 4 " + linkedHashSet.remove(student4));
        System.out.println("LinkedHashSet = " + linkedHashSet.toString());


        //TreeSet
        Set<Student> treeSet = new TreeSet<>();
        treeSet.addAll(linkedHashSet);

        System.out.println("\nTreeSeet = " + treeSet.toString());
        System.out.println("Del Student 2 " + treeSet.remove(student2));
        System.out.println("TreeSeet = " + treeSet.toString());


        //HashMap
        Map<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1, student);
        hashMap.put(2, student2);
        hashMap.put(3, student3);
        hashMap.put(4, student4);

        System.out.println("\nHashMap = " + hashMap.values());
        System.out.println("hashMap - Studetn3 = " + hashMap.get(3));
        System.out.println("Del student 1 and 2" + hashMap.remove(1) + hashMap.remove(2));
        System.out.println("HashMap = " + hashMap.values());
    }
}
