package cn.sky03.structural.adapter.classadapter;

import cn.sky03.structural.adapter.classadapter.voltage.VoltageAdapter;

public class Client {
    public static void main(String[] args) {
        System.out.println(" ==== 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
