package cn.sky03.structural.adapter.objectadapter;

import cn.sky03.structural.adapter.objectadapter.voltage.Voltage220V;
import cn.sky03.structural.adapter.objectadapter.voltage.VoltageAdapter;

public class Client {
    public static void main(String[] args) {
        System.out.println(" ==== 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
