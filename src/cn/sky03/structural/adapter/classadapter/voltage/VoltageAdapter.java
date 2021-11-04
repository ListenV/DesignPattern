package cn.sky03.structural.adapter.classadapter.voltage;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        int src = output220V();
        int targetSrc= src/44; //将220V电压转换为5V电压
        return targetSrc;
    }
}
