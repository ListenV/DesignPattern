package cn.sky03.structural.proxy.staticProxy;

public class Client {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add(); //代理来执行，不改变原有UserServiceImpl的代码，来对其增加功能
    }
}
