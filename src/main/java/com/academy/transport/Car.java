package com.academy.transport;

import com.academy.details.Battery;
import com.academy.details.Engine;
import com.academy.details.Radiator;
import com.academy.intface.ICar;

import java.util.Objects;

public class Car extends Transport implements ICar {

    private BodyTypeCar bodyTypeCar;
    private Engine engine;
    private Battery battery;
    private Radiator radiator;
    private boolean isStart;

    //Пункт.2 Домашнее задание№7.
    //задание Добавьте статическую переменную и статический метод, вызовите метод в main методе
    //статик переменная
    private static int countCar;


    public Car(String model, int height, int weght, int maxSpeed, String color, BodyTypeCar bodyTypeCar, Engine engine, Battery battery, Radiator radiator, boolean isStart) {
        super(model, height, weght, maxSpeed, color);
        this.bodyTypeCar = bodyTypeCar;
        this.engine = engine;
        this.battery = battery;
        this.radiator = radiator;
        this.isStart = isStart;
        countCar++;
    }

    public Car(String model, BodyTypeCar bodyTypeCar, Engine engine, Battery battery, Radiator radiator, boolean isStart) {
        super(model);
        this.bodyTypeCar = bodyTypeCar;
        this.engine = engine;
        this.battery = battery;
        this.radiator = radiator;
        this.isStart = isStart;
    }

    public boolean isStart() {
        if (isStart == false) {
            return isStart = true;
        } else {
            return isStart = false;
        }
    }

    //Пункт.2 Домашнее задание№7.
    //статик метод
    public static void countCar() {
        System.out.println(countCar);
    }

    @Override
    public String changeСolor(String color) {
        setColor(color);
        return color;
    }

    @Override
    public void displayInfo() {
        System.out.println("Модель машины: " + super.getModel() +
                "\nМаксимальная скорость: " + super.getMaxSpeed() +
                "\nДвигатель: модель = " + engine.getModel() + ", тип двигателя = " + engine.getTypeEngine() + ", мощность = " + engine.getPower() +
                "\nБатареия: мощность = " + battery.getPower() + ", емкость = " + battery.getCapacity() +
                "\nРадиатор: " + radiator.getModel());
    }

    @Override
    public void putOnCharge() {
        System.out.println("Ваша машина на зарядке");
    }

    @Override
    public void viewModel() {
        System.out.println("Модель машины: = " + getModel());
    }

    //Пункт.1 Домашнее задание№7.
    //задание Переопределите toString, equals, hashcode и вызовите их в main методе
    //сгенерировал equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return isStart == car.isStart && Objects.equals(bodyTypeCar, car.bodyTypeCar) && Objects.equals(engine, car.engine) && Objects.equals(battery, car.battery) && Objects.equals(radiator, car.radiator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyTypeCar, engine, battery, radiator, isStart);
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyType='" + bodyTypeCar + '\'' +
                ", engine=" + engine +
                ", battery=" + battery +
                ", radiator=" + radiator +
                ", isStart=" + isStart +
                '}';
    }

    public void printInfo() {
        System.out.println("Метод не принимает параметры");
    }

    public void printInfo(String string){
        System.out.println("Метод принимает String");
    }

    public void printInfo(int number){
        System.out.println("Метод принимает int");
    }

    public BodyTypeCar getBodyTypeCar() {
        return bodyTypeCar;
    }

    public void setBodyTypeCar(BodyTypeCar bodyTypeCar) {
        this.bodyTypeCar = bodyTypeCar;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Radiator getRadiator() {
        return radiator;
    }

    public void setRadiator(Radiator radiator) {
        this.radiator = radiator;
    }

    public void setStart(boolean start) {
        isStart = start;
    }
}
