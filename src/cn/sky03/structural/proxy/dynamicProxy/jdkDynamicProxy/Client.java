package cn.sky03.structural.proxy.dynamicProxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserService serviceProxy = (UserService) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class[]{UserService.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("方法执行前。。。");
                        method.invoke(userService);
                        System.out.println("方法执行后。。。");
                        return null;
                    }
                });
        serviceProxy.add();
    }
}
