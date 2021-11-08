package cn.sky03.structural.proxy.dynamicProxy.cglib;

import cn.sky03.structural.proxy.targetObj.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Client2 {
    public static void main(String[] args) {
        UserServiceImpl target = new UserServiceImpl();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("Before...");
                Object returnVal = method.invoke(target, objects);
                System.out.println("After...");
                return returnVal;
            }
        });
        UserServiceImpl proxy = (UserServiceImpl) enhancer.create();
        proxy.del();
    }
}
