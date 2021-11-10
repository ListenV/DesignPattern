package cn.sky03.creational.singleton;

// 双重检查（Double Check）
public class Singleton5 {
    private static volatile Singleton5 singleton;
    private Singleton5() {}
    public static Singleton5 getInstance() {
        if (singleton == null) {
            synchronized (Singleton5.class){
                if (singleton == null) {
                    singleton = new Singleton5();
                }
            }
        }
        return singleton;
    }
}

/*
 * 1. Double-Check 概念 是多线程开发中常使用到的，如代码中所示，我们进行了两次 `if (singleton == null)` 检查，这样就可以保证线程安全了。
 * 2. 这样，实例化代码只用执行一次，后面再次访问时，判断 `if (singleton == null)` 直接 return 已经实例化的对象，也避免的反复进行方法同步
 * 3. **解决线程安全问题，同时解决懒加载问题，还有不错的效率**
 * 4. 结论：在实际开发中，推荐使用这种单例设计模式
 */
