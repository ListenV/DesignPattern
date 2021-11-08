package cn.sky03.structural.proxy.dynamicProxy.cglib;

import cn.sky03.structural.proxy.targetObj.UserServiceImpl;

public class Client {
    public static void main(String[] args) {

        // 创建目标对象
        UserServiceImpl target = new UserServiceImpl();
        // 获取代理对象，并将目标对象传给代理工厂
        UserServiceImpl proxyUserService = (UserServiceImpl) new ProxyFactory(target).getProxyInstance();
        proxyUserService.add();

    }
}
