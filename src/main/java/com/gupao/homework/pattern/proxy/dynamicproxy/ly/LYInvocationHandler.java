package com.gupao.homework.pattern.proxy.dynamicproxy.ly;

import java.lang.reflect.Method;

/**
 * @author liuyang
 * @date 2019/4/15 20:14
 * @description
 */
public interface LYInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
