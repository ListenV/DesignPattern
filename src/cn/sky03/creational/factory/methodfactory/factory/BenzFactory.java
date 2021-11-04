package cn.sky03.creational.factory.methodfactory.factory;

import cn.sky03.creational.factory.methodfactory.car.Benz;
import cn.sky03.creational.factory.methodfactory.car.Car;

public class BenzFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Benz();
    }
}
