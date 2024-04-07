package com.academy.intface;

public interface IBattery {

    String INFO = "Информация о батареи";

    public void isBatteryСharging();

    default void viewInfoBattery(String info){
        viewInfoBattery(INFO);
    }
}
