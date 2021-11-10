package cn.sky03.creational.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance == instance2); //true

        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
