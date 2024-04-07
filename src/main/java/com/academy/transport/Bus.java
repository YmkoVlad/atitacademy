package com.academy.transport;

import com.academy.intface.IBus;

import java.util.Objects;

public class Bus extends Transport implements IBus {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return maxPlace == bus.maxPlace && numberOfWheels == bus.numberOfWheels && isStart == bus.isStart;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxPlace, numberOfWheels, isStart);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "maxPlace=" + maxPlace +
                ", numberOfWheels=" + numberOfWheels +
                ", isStart=" + isStart +
                '}';
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
