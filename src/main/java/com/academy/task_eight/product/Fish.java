package com.academy.task_eight.product;

public  class Fish extends Seafood{

    private String nameFish;
    private String typeOfFish;
    private boolean isEdible;

    public Fish(int weight, int calories, String sea, String state, String nameFish, String typeOfFish, boolean isEdible) {
        super(weight, calories, sea, state);
        this.nameFish = nameFish;
        this.typeOfFish = typeOfFish;
        this.isEdible = isEdible;
    }

    public void informationAboutFish() {
        System.out.println("Рыба: " + nameFish + ",  " + typeOfFish + ", состояние " + getState() + ", можно кушать? =" + isEdible);
    }

    public String getNameFish() {
        return nameFish;
    }

    public void setNameFish(String nameFish) {
        this.nameFish = nameFish;
    }

    public String getTypeOfFish() {
        return typeOfFish;
    }

    public void setTypeOfFish(String typeOfFish) {
        this.typeOfFish = typeOfFish;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean edible) {
        isEdible = edible;
    }
}
