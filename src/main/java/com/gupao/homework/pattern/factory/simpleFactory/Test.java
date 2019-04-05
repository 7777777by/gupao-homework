package com.gupao.homework.pattern.factory.simpleFactory;

import com.gupao.homework.pattern.factory.Fridge;
import com.gupao.homework.pattern.factory.IProduct;
import com.gupao.homework.pattern.factory.TV;
import com.gupao.homework.pattern.factory.Washer;

/**
 * @author liuyang
 * @date 2019/4/5 18:08
 * @description
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        // 生产电视
        IProduct tv = ProductFactory.createProduct(TV.class);
        tv.doSomething();
        System.out.println("---------------------------");
        // 生产冰箱
        IProduct fridge = ProductFactory.createProduct(Fridge.class);
        fridge.doSomething();
        System.out.println("---------------------------");
        // 生产洗衣机
        IProduct washer = ProductFactory.createProduct(Washer.class);
        washer.doSomething();
    }
}
