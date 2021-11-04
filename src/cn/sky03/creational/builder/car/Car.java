package cn.sky03.creational.builder.car;

import cn.sky03.creational.builder.components.Engine;
import cn.sky03.creational.builder.components.GPSNavigator;
import cn.sky03.creational.builder.components.Transmission;
import cn.sky03.creational.builder.components.TripComputer;

public class Car {
    private final CarType carType;              //车子类型
    private final int seats;                    //座位数量
    private final Engine engine;                //引擎
    private final Transmission transmission;    //传动
    private final TripComputer tripComputer;    //车载电脑
    private final GPSNavigator gpsNavigator;    //GPS
    private double fuel = 0;                    //燃料

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }
    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
