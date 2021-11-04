package cn.sky03.creational.factory.methodfactory;

import cn.sky03.creational.factory.methodfactory.car.Car;
import cn.sky03.creational.factory.methodfactory.factory.BenzFactory;

public class Consumer {
    public static void main(String[] args) {
        BenzFactory benzFactory = new BenzFactory();
        Car benz = benzFactory.getCar();
        benz.run();
        benz.stop();
    }
}
