package cn.sky03.structural.adapter.classadapter.voltage;

public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("电压为 " + src +" V");
        return src;
    }
}
