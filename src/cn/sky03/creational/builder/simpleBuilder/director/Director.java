package cn.sky03.creational.builder.simpleBuilder.director;

import cn.sky03.creational.builder.simpleBuilder.builders.Builder;
import cn.sky03.creational.builder.simpleBuilder.car.CarType;
import cn.sky03.creational.builder.simpleBuilder.components.Engine;
import cn.sky03.creational.builder.simpleBuilder.components.GPS;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructTesla(String name){
        builder.setCarType(CarType.Tesla);
        builder.setName(name);
        builder.setEngine(new Engine("V8"));
        builder.setGPS(new GPS("北斗"));
    }
}
