package cn.sky03.creational.factory.simplefactory;

import cn.sky03.creational.factory.simplefactory.car.Car;
import cn.sky03.creational.factory.simplefactory.factory.CarFactory;

public class Consumer {
    public static void main(String[] args) {

        Car benz = CarFactory.getInstance("Benz");
        benz.run();
        benz.stop();
        Car tesla = CarFactory.getInstance("TeslaFactory");
        tesla.run();
        tesla.stop();
    }
}
