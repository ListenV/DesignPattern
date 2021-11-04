package cn.sky03.creational.singleton;

public class SingletonDemo3 {

    public static void main(String[] args) {
        System.out.println("懒汉式1 ， 线程不安全~");
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton3 {
    private static Singleton3 instance;
    private Singleton3() {}

    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    //即懒汉式
    public static Singleton3 getInstance() {
        if(instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}

