package com.academy.FactoryMathod;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws IOException {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("config");
        IDriver driver = getDriver(resourceBundle.getString("driverType"));
        driver.createSession();

        FileReader fileReader = new FileReader("src/main/resources/config.properties");
        Properties properties = new Properties();
        properties.load(fileReader);

        System.out.println("Froam properties: " + properties.getProperty("driverType"));
    }

    public static IDriver getDriver(String driverName) {
        if (driverName.equals("chrome")) {
            return new ChromeDriver();
        } else {
            return new FireFoxDriver();
        }
    }
}
