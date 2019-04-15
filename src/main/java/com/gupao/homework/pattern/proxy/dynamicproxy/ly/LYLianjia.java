package com.gupao.homework.pattern.proxy.dynamicproxy.ly;

import java.lang.reflect.Method;

/**
 * @author liuyang
 * @date 2019/4/15 20:18
 * @description
 */
public class LYLianjia implements LYInvocationHandler {
    private Object target;

    public Object getInstance(Object obj) {
        this.target = obj;
        Class<?> clazz = this.target.getClass();
        return LYProxy.newProxyInstance(new LYClassLoader(), clazz.getInterfaces(), this);
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
