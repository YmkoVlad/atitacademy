package com.academy.intface;

public interface IntarfaceBattery {

    String INFO = "Информация о батареи";

    public void isBatteryСharging();

    default void viewInfoBattery(String info){
        viewInfoBattery(INFO);
    }
}
