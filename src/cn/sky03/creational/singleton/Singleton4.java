package cn.sky03.creational.singleton;

public class Singleton4 {
    private static Singleton4 instance;
    private Singleton4 (){}
    // 加个synchronized关键字，同步处理代码，解决线程安全问题
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}

/*
 * 1. 线程安全
 * 2. 效率太低了，每个线程在想获得类的实例时候，执行 `getInstance()` 方法都要进行同步。
 *     其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。
 *     方法进行同步效率太低
 * 3. 结论：**在实际开发中，不推荐使用这种方式**
 */