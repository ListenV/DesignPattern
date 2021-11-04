package cn.sky03.creational.factory.methodfactory.factory;

import cn.sky03.creational.factory.methodfactory.car.Car;
import cn.sky03.creational.factory.methodfactory.car.Tesla;

public class TeslaFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
