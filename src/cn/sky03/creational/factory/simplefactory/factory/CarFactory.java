package cn.sky03.creational.factory.simplefactory.factory;

import cn.sky03.creational.factory.simplefactory.car.Benz;
import cn.sky03.creational.factory.simplefactory.car.Car;
import cn.sky03.creational.factory.simplefactory.car.Tesla;

public class CarFactory {
    public static Car getInstance(String type) {
        Car car = null;
        if (type.equals("Benz")) {
            car = new Benz();
        } else if (type.equals("TeslaFactory")) {
            car = new Tesla();
        }
        return car;
    }
}
