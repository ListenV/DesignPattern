package cn.sky03.creational.singleton;

// 枚举实现单例
public class Singleton7 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode() == instance2.hashCode());
        instance.sayOK();
    }
}

enum Singleton{
    INSTANCE;   // INSTANCE为Singleton中的一个对象
    void sayOK(){
        System.out.println("OK");
    }
}
