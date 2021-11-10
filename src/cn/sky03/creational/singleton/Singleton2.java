package cn.sky03.creational.singleton;

// 饿汉式（静态代码块）
public class Singleton2 {
    //私有构造方法，外部不能new
    private Singleton2() {}

    //内部调用构造方法，创建对象实例
    private static final Singleton2 instance;

    static {instance = new Singleton2();}

    //提供公有静态方法，返回实例
    public static Singleton2 getInstance() {
        return instance;
    }
}

/*
 这种方式和Singleton1一样，只不过将类实例化的过程放在了静态代码块中
 优缺点和Singleton1是一样的。
 */
