package com.gupao.homework.pattern.singleton.threadlocal;

/**
 * @author liuyang
 * @date 2019/4/6 16:52
 * @description 只能实现线程内安全，线程之间不能保证单例
 */
public class ThreadLocalSingleton {
    private static ThreadLocal<ThreadLocalSingleton> singletonThreadLocal =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {};

    public static final ThreadLocalSingleton getInstance() {
        return singletonThreadLocal.get();
    }
}
