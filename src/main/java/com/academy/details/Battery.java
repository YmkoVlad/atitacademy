package com.academy.details;

import com.academy.intface.IBattery;

public class Battery implements IBattery {

    private int power;

    private int capacity;
    private int weight;

    public Battery(int power, int capacity, int weight) {
        this.power = power;
        this.capacity = capacity;
        this.weight = weight;
    }

    @Override
    public void isBatteryСharging() {
        System.out.println("Батарея на зарядке");
    }

    @Override
    public void viewInfoBattery(String info) {
        IBattery.super.viewInfoBattery(info);
    }

    @Override
    public String toString() {
        return "Battery{" +
                "power=" + power +
                ", capacity=" + capacity +
                ", weight=" + weight +
                '}';
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
