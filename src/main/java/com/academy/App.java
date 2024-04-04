package com.academy;

import com.academy.details.Battery;
import com.academy.details.Engine;
import com.academy.details.Radiator;
import com.academy.task_eight.Products;
import com.academy.task_eight.product.Caviar;
import com.academy.task_eight.product.Fish;
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

        Car car = new Car("TeslaTest", 2, 1900, 360, "Red", "coupe", engine, battery, radiator, false);
        Bus bus = new Bus("BusTest", 3, 6000, 180, "Black", 40, 12, false);
//
//        System.out.println("Модель: " + car.getModel() +
//                ", высота: " + car.getHeight() +
//                ", максимальная скорость: " + car.getMaxSpeed() +
//                ", кузов: " + car.getBodyType() +
//                ",модель двигателя: " + car.getEngine().getModel() +
//                ", мощность батареи: " + car.getBattery().getPower() +
//                ", модель радиатора: " + car.getRadiator().getModel());
//
//
//        System.out.println("Вашина заведена? " + car.isStart());
//        System.out.println("Вашина заведена? " + car.isStart());
//        System.out.println("Цвет машины: " + car.getColor());
//
//        car.changeСolor("Black");
//        System.out.println("Цвет машины: " + car.getColor());
//
//        car.viewModel();
//        bus.viewModel();
//
//
//        Caviar caviar = new Caviar(100, 50, "Черное море", "солёная", "Осётр", "Хищная", true, "Чёрная икра", "Домашняя дикая икра");
//        caviar.informationAboutCaviar();
//
//        Fish fish = new Fish(10, 300, "Тихий океан", "замороженная", "Акула ))", "Хищная", true);
//        fish.informationAboutFish();

        //task_six

        Transport car2 = new Car("modelTest2", 130, 250, 360, "red", "bodyTest2", engine, battery, radiator, false );
        Transport bus2 = new Bus("busTest2", 450, 4, 230, "blue", 32, 12, false);

        car.displayInfo();
        car.putOnCharge();

        bus.isStartBus();
        bus.isStopBus();
        bus.displayInfo();

        car2.viewModelTransport();
        System.out.println("Максимальная скорость машины " + car2.getModel() + " = " + car2.getMaxSpeed());






    }
}
