package cn.sky03.creational.builder.carBuilder.builders;

import cn.sky03.creational.builder.carBuilder.car.CarType;
import cn.sky03.creational.builder.carBuilder.car.Manual;
import cn.sky03.creational.builder.carBuilder.components.Engine;
import cn.sky03.creational.builder.carBuilder.components.GPSNavigator;
import cn.sky03.creational.builder.carBuilder.components.Transmission;
import cn.sky03.creational.builder.carBuilder.components.TripComputer;

// 生成器与其他创建型模式的不同之处在于：它让你能创建不遵循相同接口的产品。
public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
