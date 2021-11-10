package cn.sky03.creational.builder.carBuilder.car;

import cn.sky03.creational.builder.carBuilder.components.Engine;
import cn.sky03.creational.builder.carBuilder.components.GPSNavigator;
import cn.sky03.creational.builder.carBuilder.components.Transmission;
import cn.sky03.creational.builder.carBuilder.components.TripComputer;

// 用户使用手册应该根据汽车配置进行编制，并介绍汽车的所有功能。
public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        StringBuilder info = new StringBuilder();
        info.append("车子品牌：").append(carType).append("\n");
        info.append("座位数量：").append(seats).append("\n");
        info.append("引擎: volume - ").append(engine.getVolume()).append("; mileage - ").append(engine.getMileage()).append("\n");
        info.append("Transmission: ").append(transmission).append("\n");
        if (this.tripComputer != null) {
            info.append("Trip Computer: Functional" + "\n");
        } else {
            info.append("车载电脑： N/A" + "\n");
        }
        if (this.gpsNavigator != null) {
            info.append("GPS定位系统： 已启动！" + "\n");
        } else {
            info.append("GPS定位系统： N/A" + "\n");
        }
        return info.toString();
    }
}
