package cn.sky03.creational.factory.simplefactory.car;

public class Tesla implements Car{

    @Override
    public void run() {
        System.out.println("TeslaFactory running...");
    }

    @Override
    public void stop() {
        System.out.println("TeslaFactory stopping...");
    }
}
