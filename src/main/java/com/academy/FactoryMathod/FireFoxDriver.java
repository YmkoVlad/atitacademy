package com.academy.FactoryMathod;

public class FireFoxDriver implements IDriver{
    @Override
    public void createSession() {
        System.out.println("FireFox");
    }
}
