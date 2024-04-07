package com.academy.details;

public class Radiator {

    private String model;
    private int width;
    private int height;
    private int weight;
    private String typeRadiator;

    public Radiator(String model, int width, int height, int weight, String typeRadiator) {
        this.model = model;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.typeRadiator = typeRadiator;
    }

    @Override
    public String toString() {
        return "Radiator{" +
                "model='" + model + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", typeRadiator='" + typeRadiator + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTypeRadiator() {
        return typeRadiator;
    }

    public void setTypeRadiator(String typeRadiator) {
        this.typeRadiator = typeRadiator;
    }
}
