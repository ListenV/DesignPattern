package cn.sky03.creational.builder.carBuilder.director;

import cn.sky03.creational.builder.carBuilder.builders.Builder;
import cn.sky03.creational.builder.carBuilder.car.CarType;
import cn.sky03.creational.builder.carBuilder.components.Engine;
import cn.sky03.creational.builder.carBuilder.components.GPSNavigator;
import cn.sky03.creational.builder.carBuilder.components.Transmission;
import cn.sky03.creational.builder.carBuilder.components.TripComputer;

// 指挥者
// 主管只负责按照特定顺序执行生成步骤。其在根据特定步骤或配置来生成产品时
// 会很有帮助。由于客户端可以直接控制生成器，所以严格意义上来说，主管类并
// 不是必需的。
public class Director {
    public void constructTeslaCar(Builder builder) {
        builder.setCarType(CarType.Tesla);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructBenzCar(Builder builder) {
        builder.setCarType(CarType.Benz);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
