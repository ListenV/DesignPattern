package cn.sky03.structural.proxy.staticProxy;

import cn.sky03.structural.proxy.staticProxy.service.UserService;
import cn.sky03.structural.proxy.staticProxy.service.UserServiceImpl;

public class Client {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        proxy.add(); //代理来执行，不改变原有UserServiceImpl的代码，来对其增加功能
    }
}
