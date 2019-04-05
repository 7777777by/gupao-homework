package com.gupao.homework.pattern.factory.abstractfactory;

/**
 * @author liuyang
 * @date 2019/4/5 18:31
 * @description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        // 海尔工厂
        IProductFactory factory = new HaierFactory();
        factory.createTV().doShow();
        factory.createFridge().doIce();
        factory.createWasher().doWish();
        System.out.println("---------------------------");
        // 小米工厂
        factory = new XiaomiFactory();
        factory.createTV().doShow();
        factory.createFridge().doIce();
        factory.createWasher().doWish();
    }
}
