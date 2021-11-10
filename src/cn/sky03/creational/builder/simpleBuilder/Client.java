package cn.sky03.creational.builder.simpleBuilder;

import cn.sky03.creational.builder.simpleBuilder.builders.CarBuilder;
import cn.sky03.creational.builder.simpleBuilder.car.CarType;
import cn.sky03.creational.builder.simpleBuilder.components.Engine;
import cn.sky03.creational.builder.simpleBuilder.components.GPS;
import cn.sky03.creational.builder.simpleBuilder.director.Director;

public class Client {
    public static void main(String[] args) {

        CarBuilder carBuilder = new CarBuilder();
        // 使用指挥者来创建
        new Director(carBuilder).constructTesla("T1");
        System.out.println(carBuilder.getCar());

        // 也可以自己手动设置
        CarBuilder carBuilder1 = new CarBuilder();
        carBuilder1.setCarType(CarType.Benz);
        carBuilder1.setName("黑色星期五");
        carBuilder1.setEngine(new Engine("V10"));
        carBuilder1.setGPS(new GPS("北斗"));
        System.out.println(carBuilder1.getCar());

    }
}
