package cn.sky03.creational.factory.simplefactory.car;

public class Benz implements Car{
    @Override
    public void run() {
        System.out.println("Benz running...");
    }

    @Override
    public void stop() {
        System.out.println("Benz stopped...");
    }
}
