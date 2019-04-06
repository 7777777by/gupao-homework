package com.gupao.homework.pattern.singleton;

/**
 * @author liuyang
 * @date 2019/4/6 15:03
 * @description
 */
public class LazyNotSafeSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ConstructorExecutor());
        Thread t2 = new Thread(new ConstructorExecutor());
        t1.start();
        t2.start();

        System.out.println("end");
    }
}
