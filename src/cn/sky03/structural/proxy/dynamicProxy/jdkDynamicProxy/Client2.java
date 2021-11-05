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
            // returnVal是代理方法的返回值；有就有，没有就没有
            // args是代理方法的参数；有就有，没有就没有
            Object returnVal = method.invoke(userService, args);
            System.out.println("方法执行后。。。");
            return returnVal;
        }
    }
}

