package cn.sky03.creational.singleton;

public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3() {}

    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance，从而达到LazyLoading的效果
    //即懒汉式
    public static Singleton3 getInstance() {
        if(instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
