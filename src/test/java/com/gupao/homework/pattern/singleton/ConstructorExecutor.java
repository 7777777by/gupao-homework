package com.gupao.homework.pattern.singleton;

import com.gupao.homework.pattern.singleton.lazy.LazyNotSafeSingleton;
import com.gupao.homework.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author liuyang
 * @date 2019/4/6 15:04
 * @description
 */
public class ConstructorExecutor implements Runnable {
    public void run() {
//        LazyNotSafeSingleton instance = LazyNotSafeSingleton.getInstance();
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
