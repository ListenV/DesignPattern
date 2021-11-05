package cn.sky03.structural.proxy.dynamicProxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client2 {

    public static void main(String[] args) {
        UserService service = (UserService) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class[]{UserService.class},
                new UserServiceInvocationHandler(new UserServiceImpl()));
        service.add();

    }
    private static class UserServiceInvocationHandler implements InvocationHandler{

        private final UserService userService;

        public UserServiceInvocationHandler(UserService userService) {
            this.userService = userService;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("方法执行前。。。");
            method.invoke(userService);
            System.out.println("方法执行后。。。");
            return null;
        }
    }
}

