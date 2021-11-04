package cn.sky03.creational.singleton;

/*
 * 饿汉式（静态代码块）
 */

public class SingletonDemo2 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance == instance2); //true

        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton2 {
    //私有构造方法，外部不能new
    private Singleton2(){}

    //内部调用构造方法，创建对象实例
    private static Singleton2 instance;

    static {
         instance = new Singleton2();
    }

    //提供公有静态方法，返回实例
    public static Singleton2 getInstance(){
        return instance;
    }
}

/*
 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。
 优缺点和上一种是一样的。

 结论：这种单例模式可用，但可能会造成内存浪费。
 */
