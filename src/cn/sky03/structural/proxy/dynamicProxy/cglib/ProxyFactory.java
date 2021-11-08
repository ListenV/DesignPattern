package cn.sky03.structural.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    // 维护一个目标对象（被代理对象）
    private final Object target;

    // 通过构造器传入被代理对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 返回代理对象（target对象的代理对象）
    public Object getProxyInstance() {
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
//        enhancer.setClassLoader(target.getClass().getClassLoader());
        //4. 返回创建的子类对象，即代理对象
        return enhancer.create();
    }

    // 重写 intercept()方法，会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();   //执行前代码
        Object returnVal = method.invoke(target, objects);
        after();    //执行后代码
        return returnVal;
    }

    private void before(){
        System.out.println("Before...");
    }
    private void after(){
        System.out.println("After...");
    }
}
