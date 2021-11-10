package cn.sky03.creational.builder.carBuilder.builders;

import cn.sky03.creational.builder.carBuilder.car.CarType;
import cn.sky03.creational.builder.carBuilder.components.Engine;
import cn.sky03.creational.builder.carBuilder.components.GPSNavigator;
import cn.sky03.creational.builder.carBuilder.components.Transmission;
import cn.sky03.creational.builder.carBuilder.components.TripComputer;

// 生成器接口声明了创建产品对象不同部件的方法。
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
