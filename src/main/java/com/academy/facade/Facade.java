package com.academy.facade;

public class Facade {

    public void teacherCallStudent() {
        Student student = new Student();
        student.doSmth();
        Teacher teacher = new Teacher();
        teacher.callStudent();
        student.move();
    }
}
