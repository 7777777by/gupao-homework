package com.gupao.homework.pattern.singleton.register;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liuyang
 * @date 2019/4/6 15:54
 * @description 容器获取单例
 */
public class ContainerSingleton {
    private static ConcurrentHashMap<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton() {};

    // 若两个线程同时进来，若不加synchronized，有几率同时键入if判断，
    // 导致实例化两次，破坏单例，所以此处要加synchronized
    public static Object getBean(String className) {
        synchronized (ioc) {
            try {
                if (!ioc.contains(className)) {
                    Object obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                    return obj;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ioc.get(className);
        }
    }
}
