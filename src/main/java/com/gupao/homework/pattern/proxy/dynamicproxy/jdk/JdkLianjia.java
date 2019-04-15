package com.gupao.homework.pattern.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuyang
 * @date 2019/4/15 19:57
 * @description
 */
public class JdkLianjia implements InvocationHandler {
    private Object target;

    public Object getInstance(Object object) {
        this.target = object;
        Class<?> clazz = this.target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("前置增强方法：了解客户需求，开始查找房源...");
    }

    private void after() {
        System.out.println("后置增强方法：找到符合客户要求的房子了。");
    }
}
