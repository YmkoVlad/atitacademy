package com.academy;

import com.academy.details.Battery;
import com.academy.details.Engine;
import com.academy.details.Radiator;
import com.academy.transport.BodyTypeCar;
import com.academy.transport.Bus;
import com.academy.transport.Car;
import com.academy.transport.Transport;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new Engine("TestOne","electronic", 900, 550);
        Battery battery = new Battery(1400,9000, 900);
        Radiator radiator = new Radiator("Alumin", 300, 200, 4,"water");
        Engine engine2 = new Engine("TestTwo", "petrol", 1100, 500);

        Car car = new Car("TeslaTest",
                2,
                1900,
                360,
                "Red",
                BodyTypeCar.COUPE,
                engine, battery, radiator,
                false);
        Bus bus = new Bus("BusTest",
                3,
                6000,
                180,
                "Black",
                40,
                12,
                false);

        //home_work_six

        Transport car2 = new Car("modelTest2",
                130,
                250,
                360,
                "red",
                BodyTypeCar.CABRIOLET,
                engine, battery, radiator,
                false );
        Transport bus2 = new Bus("busTest2",
                450,
                4,
                230,
                "blue",
                32,
                12,
                false);

        //проверка equals, HashCode, Enum
        System.out.println(car);
        System.out.println("equals car and car2 = " + car.equals(car2));
        System.out.println("HashCode car = " + car.hashCode());
        System.out.println("Enam = " + BodyTypeCar.MINIVAN);
        System.out.println("Enam title = " + BodyTypeCar.MINIVAN.getTitle());

        //Вызвал статик метод из класса Car
        //Пункт.2 Домашнее задание№7.
        //задание Добавьте статическую переменную и статический метод, вызовите метод в main методе
        Car.countCar();

        //проверка equals, HashCode - написанных в ручную
        System.out.println("HashCode Engine = " + engine.hashCode());
        System.out.println("HashCode Engine2 = " + engine2.hashCode());
        System.out.println("equals Engine and Engine2 = " + engine.equals(engine2));

        System.out.println("equals Engine and Engine = " + engine.equals(engine));








    }
}
