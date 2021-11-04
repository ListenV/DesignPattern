package cn.sky03.structural.adapter.objectadapter.voltage;

public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    // 通过构造器，传入一个 Voltage220V 实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int target = 0;
        if (null != voltage220V){
            int src = voltage220V.output220V(); //获取220V 电压
            System.out.println("使用对象适配器，进行适配~~");
            target = src/44;//将220V电压转换为5V电压
            System.out.println("适配完成，输出的电压为：" + target);
        }
        return  target;
    }
}
