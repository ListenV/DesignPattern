package cn.sky03.creational.builder.builders;

import cn.sky03.creational.builder.car.CarType;
import cn.sky03.creational.builder.components.Engine;
import cn.sky03.creational.builder.components.GPSNavigator;
import cn.sky03.creational.builder.components.Transmission;
import cn.sky03.creational.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
