package cn.sky03.creational.builder.simpleBuilder.builders;

import cn.sky03.creational.builder.simpleBuilder.car.Car;
import cn.sky03.creational.builder.simpleBuilder.car.CarType;
import cn.sky03.creational.builder.simpleBuilder.components.Engine;
import cn.sky03.creational.builder.simpleBuilder.components.GPS;

public class CarBuilder implements Builder {
    private String name;
    private CarType carType;
    private Engine engine;                //引擎
    private GPS gps;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setGPS(GPS gps) {
        this.gps = gps;
    }

    public Car getCar(){
        return new Car(name,carType,engine,gps);
    }

}
