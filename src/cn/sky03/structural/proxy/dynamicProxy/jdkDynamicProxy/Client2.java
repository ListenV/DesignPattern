package cn.sky03.structural.proxy.dynamicProxy.jdkDynamicProxy;

import cn.sky03.structural.proxy.dynamicProxy.jdkDynamicProxy.service.UserService;
import cn.sky03.structural.proxy.dynamicProxy.jdkDynamicProxy.service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client2 {

    public static void main(String[] args) {
        // 实例化被代理对象
        UserService userService = new UserServiceImpl();
        // 拿到代理对象
        UserService service = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                new UserServiceInvocationHandler(userService));
        // 由代理对象来执行方法
        service.add();
        System.out.println("---------------");
        // UserServiceImpl中的所有方法都被代理了
        service.del();
        System.out.println("---------------");
        service.update();
    }

    private static class UserServiceInvocationHandler implements InvocationHandler{

        // 接收被代理对象
        private final UserService userService;

        public UserServiceInvocationHandler(UserService userService) {
            this.userService = userService;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("方法执行前。。。");
            // returnVal是被代理方法的返回值；有就有，没有就没有
            // args是代理方法的参数；有就有，没有就没有
            // userService是被代理的已经实例化的对象，实例化的对象才能执行方法
            Object returnVal = method.invoke(userService, args);
            System.out.println("方法执行后。。。");
            return returnVal;
        }
    }
}

