package com.academy.transport;

import com.academy.intface.InterfaceBus;

public class Bus extends Transport implements InterfaceBus {
    private int maxPlace;
    private int numberOfWheels;
    boolean isStart;


    public Bus(String model, int height, int weght, int maxSpeed, String color, int maxPlace, int numberOfWheels, boolean start) {
        super(model, height, weght, maxSpeed, color);
        this.maxPlace = maxPlace;
        this.numberOfWheels = numberOfWheels;
        this.isStart = start;
    }


    public boolean isStart() {
        if (isStart == false) {
            return isStart = true;
        } else {
            return isStart = false;
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Модель автобуса: " + super.getModel() +
                "\nМаксимальная скорость: " + super.getMaxSpeed() +
                "\nМаксимальное количество мест = " + getMaxPlace()+
                "\nКоличество колёс = " + getNumberOfWheels());
    }

    @Override
    public boolean isStartBus() {
        return isStart = true;
    }

    @Override
    public boolean isStopBus() {
        return isStart = false;
    }

    @Override
    public String changeСolor(String color) {
        return color;
    }


    public int getMaxPlace() {
        return maxPlace;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setMaxPlace(int maxPlace) {
        this.maxPlace = maxPlace;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setStart(boolean start) {
        this.isStart = start;
    }

}
