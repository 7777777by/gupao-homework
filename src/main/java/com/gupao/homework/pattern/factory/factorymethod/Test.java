package com.gupao.homework.pattern.factory.factorymethod;

/**
 * @author liuyang
 * @date 2019/4/5 18:15
 * @description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        // 生产电视
        IProductFactory factory = new TVFactory();
        factory.createProduct().doSomething();
        System.out.println("---------------------------");
        // 生产冰箱
        factory = new FridgeFactory();
        factory.createProduct().doSomething();
        System.out.println("---------------------------");
        // 生产洗衣机
        factory = new WasherFactory();
        factory.createProduct().doSomething();
    }
}
