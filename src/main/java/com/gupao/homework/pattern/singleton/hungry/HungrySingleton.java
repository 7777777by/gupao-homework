package com.gupao.homework.pattern.singleton.hungry;

/**
 * @author liuyang
 * @date 2019/4/6 13:33
 * @description 恶汉单例模式
 */
public class HungrySingleton {
    // 1、初始化对象
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    // 2、构造方法私有化，防止外部new对象
    private HungrySingleton() {};

    // 3、提供获取单例对象的方法
    public static final HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
