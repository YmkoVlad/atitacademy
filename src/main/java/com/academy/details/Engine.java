package com.academy.details;

public class Engine {

    private String model;
    private String typeEngine;
    private int power;
    private int weight;

    public Engine(String model, String typeEngine, int power, int weight) {
        this.model = model;
        this.typeEngine = typeEngine;
        this.power = power;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
