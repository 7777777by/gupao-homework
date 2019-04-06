package com.gupao.homework.pattern.singleton.serializable;

import java.io.Serializable;

/**
 * @author liuyang
 * @date 2019/4/6 15:56
 * @description 序列化单例
 */
// 进行反序列化时，JDK底层会通过无参构造来实例化一个对象，
public class SerializableSingleton implements Serializable {
    private static final SerializableSingleton SERIALIZABLE_SINGLETON = new SerializableSingleton();

    private SerializableSingleton() {};

    public static final SerializableSingleton getInstance() {
        return SERIALIZABLE_SINGLETON;
    }

    // JDK底层还是实例化了两次，但这个方法会让return的对象覆盖反序列化出来的对象
    // 所以最终返回的是单例的
    private Object readResolve() {
        return SERIALIZABLE_SINGLETON;
    }
}
