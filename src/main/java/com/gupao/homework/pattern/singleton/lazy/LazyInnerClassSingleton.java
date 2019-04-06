package com.gupao.homework.pattern.singleton.lazy;

/**
 * @author liuyang
 * @date 2019/4/6 14:34
 * @description 通过内部静态类初始化
 */
public class LazyInnerClassSingleton {
    // 1、构造方法所有化
    // 保证了不能new，但还是可以通过发射实例化的，
    // 此时，发射出来的对象和getInstance得到的对象可能不一致，违背单例的原则
    // 所以通过反射实例化的时候直接抛出异常，来保证只能用getInstance获取单例对象
    private LazyInnerClassSingleton() {
        if (InstanceHolder.lazyInnerClassSingleton != null) {
            throw new RuntimeException("不能构建多个实例！");
        }
    };

    // 2、从静态内部类中获取单例对象
    public static final LazyInnerClassSingleton getInstance() {
        return InstanceHolder.lazyInnerClassSingleton;
    }

    // 静态内部类
    // 特性：只有在第一次被引用的时候才会被加载
    private static class InstanceHolder {
        private static LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();
    }
}
