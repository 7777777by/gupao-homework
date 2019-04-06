package com.gupao.homework.pattern.singleton;

import com.gupao.homework.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @author liuyang
 * @date 2019/4/6 15:19
 * @description
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        try {
            Class<LazyInnerClassSingleton> clazz = LazyInnerClassSingleton.class;
            Constructor<LazyInnerClassSingleton> declaredConstructor = clazz.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            LazyInnerClassSingleton lazyInnerClassSingleton = declaredConstructor.newInstance();
            LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
            System.out.println(lazyInnerClassSingleton == instance); // false 破坏了单例
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
