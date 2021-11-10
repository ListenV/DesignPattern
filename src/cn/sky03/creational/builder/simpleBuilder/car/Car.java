package cn.sky03.creational.builder.simpleBuilder.car;

import cn.sky03.creational.builder.simpleBuilder.components.Engine;
import cn.sky03.creational.builder.simpleBuilder.components.GPS;

public class Car {
    private final String name;
    private final CarType carType;
    private final Engine engine;                //引擎
    private final GPS gps;

    public Car(String name, CarType carType, Engine engine, GPS gps) {
        this.name = name;
        this.carType = carType;
        this.engine = engine;
        this.gps = gps;
    }

    public String getName() {
        return name;
    }

    public CarType getCarType() {
        return carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public GPS getGps() {
        return gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carType=" + carType +
                ", 引擎：" + engine.getName() +
                ", gps：" + gps.getName() +
                '}';
    }
}

