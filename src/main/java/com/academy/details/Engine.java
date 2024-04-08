package com.academy.details;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", typeEngine='" + typeEngine + '\'' +
                ", power=" + power +
                ", weight=" + weight +
                '}';
    }


    //Пункт.4 Домашнее задание№7.
    // Написал свой hashCode - по рекомендациям статьи умножил на 31
    @Override
    public int hashCode() {
        int modelHashCode = model == null ? 0 : model.hashCode();
        int typeEngineHashCode = typeEngine == null ? 0 : typeEngine.hashCode();
        return 31 * modelHashCode + typeEngineHashCode + power + weight;
    }

    //Пункт.4 Домашнее задание№7.
    // Написал свой equals - не учитывал вес
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Engine that = (Engine) o;
        return model == that.model && typeEngine == that.typeEngine && power == that.power;
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
