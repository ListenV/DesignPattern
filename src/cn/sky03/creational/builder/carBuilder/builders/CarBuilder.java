package cn.sky03.creational.builder.carBuilder.builders;

import cn.sky03.creational.builder.carBuilder.car.Car;
import cn.sky03.creational.builder.carBuilder.car.CarType;
import cn.sky03.creational.builder.carBuilder.components.Engine;
import cn.sky03.creational.builder.carBuilder.components.GPSNavigator;
import cn.sky03.creational.builder.carBuilder.components.Transmission;
import cn.sky03.creational.builder.carBuilder.components.TripComputer;

// 具体生成器类将遵循生成器接口并提供生成步骤的具体实现。你的程序中可能会
// 有多个以不同方式实现的生成器变体。
public class CarBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    // 设置汽车座位的数量。
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    // 安装指定的引擎。
    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    // 安装行车电脑。
    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    // 安装全球定位系统。
    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
