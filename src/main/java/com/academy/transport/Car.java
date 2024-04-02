package com.academy.transport;

import com.academy.details.Battery;
import com.academy.details.Engine;
import com.academy.details.Radiator;

public class Car extends Transport {

    private String bodyType;
    private Engine engine;
    private Battery battery;
    private Radiator radiator;
    private boolean isStart;



    public Car(String model, int height, int weght, int maxSpeed, String color, String bodyType, Engine engine, Battery battery, Radiator radiator, boolean Start) {
        super(model, height, weght, maxSpeed, color);
        this.bodyType = bodyType;
        this.engine = engine;
        this.battery = battery;
        this.radiator = radiator;
        this.isStart = Start;
    }

    public boolean isStart() {
        if (isStart == false) {
            return isStart = true;
        } else {
            return isStart = false;
        }
    }

    @Override
    public String changeСolor(String color) {
        setColor(color);
        return color;
    }

    @Override
    public void viewModel() {
        System.out.println("Модель машины: = " + getModel());
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

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
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
