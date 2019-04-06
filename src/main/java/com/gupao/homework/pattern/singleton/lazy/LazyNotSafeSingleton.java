package com.gupao.homework.pattern.singleton.lazy;

/**
 * @author liuyang
 * @date 2019/4/6 13:52
 * @description 懒汉单例（最基本的写法，线程不安全）
 */
public class LazyNotSafeSingleton {
    // 1、声明单例对象
    private static LazyNotSafeSingleton lazyNotSafeSingleton = null;

    // 2、构造方法私有化
    private LazyNotSafeSingleton() {};

    // 3、提供获取单例对象的方法
    public static final LazyNotSafeSingleton getInstance() {
        // 获取的时候才进行初始化
        // 如果两个线程同时进来，同时走到new LazyNotSafeSingleton()这个地方
        // 假设线程1执行较快，线程2执行较慢
        // 线程1 new完之后直接将对象return，然后，线程2又重新new了一个对象，将结果return
        // 由于两个线程都new了一次，所以两个线程return的对象就可能不是一个，违反了单例的原则
        // 所以这样写是线程不安全的
        if (lazyNotSafeSingleton == null) {
            lazyNotSafeSingleton = new LazyNotSafeSingleton();
        }
        return lazyNotSafeSingleton;
    }
}
