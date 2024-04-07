package com.academy.transport;

import java.util.Objects;

public abstract class Transport {

    private String model;
    private int height;
    private int weght;
    private int maxSpeed;
    private String color;


    public Transport(String model, int height, int weght, int maxSpeed, String color) {
        this.model = model;
        this.height = height;
        this.weght = weght;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public Transport(String model) {
        this.model = model;
    }


    public abstract String changeСolor(String color);

    public void viewModel(){
        System.out.println("Модель транспорта: = " + model);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeght() {
        return weght;
    }

    public void setWeght(int weght) {
        this.weght = weght;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
