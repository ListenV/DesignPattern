package cn.sky03.creational.builder.simpleBuilder.builders;

import cn.sky03.creational.builder.simpleBuilder.car.CarType;
import cn.sky03.creational.builder.simpleBuilder.components.Engine;
import cn.sky03.creational.builder.simpleBuilder.components.GPS;

public interface Builder {
    void setName(String name);
    void setCarType(CarType carType);
    void setEngine(Engine engine);
    void setGPS(GPS gps);
}
