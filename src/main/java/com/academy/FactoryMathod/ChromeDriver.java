package com.academy.FactoryMathod;

public class ChromeDriver implements IDriver{

    @Override
    public void createSession() {
        System.out.println("Chrome");
    }
}
