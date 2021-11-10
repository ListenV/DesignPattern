package cn.sky03.creational.singleton;

// 静态内部类
public class Singleton6 {
    private Singleton6() {}
    private static class SingletonInstance {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

/*
 静态内部类有两个特点：
 类在被装载的时候线程是安全的

 1. Singleton6 在被装载的时候，静态内部类并不会被装载
 2. 调用 `getInstance()` 方法的时候，静态内部类会被装载，而且只会被装载一次

 所以这种写法既能实现懒加载，又能保证线程安全
 */