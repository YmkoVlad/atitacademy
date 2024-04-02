package com.academy.task_eight;

public abstract class Products {

    private int weight;
    private int calories;

    public Products(int weight, int calories) {
        this.weight = weight;
        this.calories = calories;
    }

    public final void infoProduct () {
        System.out.println("Вес: " + weight + ", калории: " + calories);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
