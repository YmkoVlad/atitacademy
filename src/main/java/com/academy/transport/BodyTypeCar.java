package com.academy.transport;

public enum BodyTypeCar {

    //Пункт.3 Домашнее задание№7.
    // Создайте любой енам, в енаме должны быть переменные, конструктор, геттеры. В main методе распечатайте енам.
    SEDAN("Седан"),
    HATCHBACK("Хэтчбек"),
    MINIVAN("Минивэн"),
    CABRIOLET("Кабриолет"),
    COUPE("Купе"),
    ROADSTER("Родстер"),
    SUPERCAR("Суперкар"),
    PICKUP("Пикап");

    private String title;

    BodyTypeCar () {}

    BodyTypeCar(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
