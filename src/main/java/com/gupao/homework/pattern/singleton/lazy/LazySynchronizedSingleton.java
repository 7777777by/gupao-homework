package com.gupao.homework.pattern.singleton.lazy;

/**
 * @author liuyang
 * @date 2019/4/6 14:00
 * @description 懒汉模式（线程安全，但影响性能）
 */
public class LazySynchronizedSingleton {
    // 1、声明单例对象
    private static LazySynchronizedSingleton lazySynchronizedSingleton = null;

    // 2、构造方法私有化
    private LazySynchronizedSingleton() {};

    // 3、提供获取单例对象的方法
    // 如果两个线程同时进来
    // 假设线程1执行较快，线程2执行较慢
    // 由于方法是synchronized，所以线程1 进来之后，线程2到这个方法时就会获取不到锁，进入monitor状态
    // 线程1 new完之后，将lazySynchronizedSingleton直接return，此时lazySynchronizedSingleton已经有值了
    // 线程1return之后，线程2获取到锁，进入这个方法
    // 此时lazySynchronizedSingleton不是null，所以直接return lazySynchronizedSingleton
    // 这样写能保证线程安全，但synchronized修饰static方法，相当于把这个类给锁了
    // 当大量线程访问这个类时，就会一直等待，严重影响性能
    public synchronized static final LazySynchronizedSingleton getInstance() {
        // 获取的时候才进行初始化
        if (lazySynchronizedSingleton == null) {
            lazySynchronizedSingleton = new LazySynchronizedSingleton();
        }
        return lazySynchronizedSingleton;
    }
}
