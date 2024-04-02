package com.academy.task_eight.product;

public final class Caviar extends Fish {

    String typeCaviar;
    String brandCaviar;

    public Caviar(int weight, int calories, String sea, String state, String name, String typeOfFish, boolean isEdible, String typeCaviar, String brandCaviar) {
        super(weight, calories, sea, state, name, typeOfFish, isEdible);
        this.typeCaviar = typeCaviar;
        this.brandCaviar = brandCaviar;
    }

    public void informationAboutCaviar() {
        System.out.println("Икра : " + brandCaviar + ", тип икры: " + typeCaviar + ", из рыбы: " + getNameFish() + ", обитающая в " + getSea());
    }

    public String getTypeCaviar() {
        return typeCaviar;
    }

    public void setTypeCaviar(String typeCaviar) {
        this.typeCaviar = typeCaviar;
    }

    public String getBrandCaviar() {
        return brandCaviar;
    }

    public void setBrandCaviar(String brandCaviar) {
        this.brandCaviar = brandCaviar;
    }
}
