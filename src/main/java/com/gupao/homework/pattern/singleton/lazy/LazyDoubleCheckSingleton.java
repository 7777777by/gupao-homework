package com.gupao.homework.pattern.singleton.lazy;

/**
 * @author liuyang
 * @date 2019/4/6 14:18
 * @description 懒汉模式（双重检查锁）
 */
public class LazyDoubleCheckSingleton {
    // 1、声明单例对象
    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    // 2、构造方法私有化
    private LazyDoubleCheckSingleton() {};

    // 3、提供获取单例对象的方法
    // 如果两个线程同时进来
    // 假设线程1执行较快，线程2执行较慢
    // 线程1和线程2同时走到synchronized代码块时，线程1先进去，此时，线程2就会变成monitor状态
    // 线程1 在synchronized代码块中new完之后，synchronized代码块的锁被释放
    // 线程2进入synchronized代码块，此时lazySynchronizedSingleton已经有值了，所以不会再new
    // 线程1和线程2最后返回的都是线程1new出来的那个对象，不会产生线程安全问题，
    // 同时，synchronized只锁定了new操作，并没有锁定这个类，所以比上一个方式好一点，但还是会对性能有一定的影响
    public static final LazyDoubleCheckSingleton getInstance() {
        // 获取的时候才进行初始化
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
