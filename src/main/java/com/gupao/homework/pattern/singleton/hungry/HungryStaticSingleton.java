package com.gupao.homework.pattern.singleton.hungry;

/**
 * @author liuyang
 * @date 2019/4/6 13:44
 * @description 恶汉单例模式（静态代码块初始化）
 */
public class HungryStaticSingleton {
    // 1、声明对象
    private static HungryStaticSingleton HUNGRY_SINGLETON = null;

    // 2、静态代码块中初始化变量
    static {
        HUNGRY_SINGLETON = new HungryStaticSingleton();
    }

    // 3、构造方法私有化，防止外部new对象
    private HungryStaticSingleton() {};

    // 4、提供获取单例对象的方法
    public static final HungryStaticSingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
