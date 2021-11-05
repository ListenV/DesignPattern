package cn.sky03.structural.proxy.dynamicProxy.jdkDynamicProxy;

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("add方法执行中。。。");
    }

    public void del() {
        System.out.println("del方法执行了！");
    }

    public void update() {
        System.out.println("update方法执行了！");
    }

    public void query() {
        System.out.println("查询方法执行了！");
    }
}
