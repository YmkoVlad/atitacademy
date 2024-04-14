package com.academy.homework_eight;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private static int countId;
    private String name;
    private String surName;
    private int age;

    public Student(String name, String surName, int age) {
        countId++;
        this.id = countId;
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(surName, student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surName);
    }


    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}
