package com.gupao.homework.pattern.strategy;

/**
 * @author liuyang
 * @date 2019/4/21 15:22
 * @description
 */
public class CalculatorTest {
    public static void main(String[] args) {
        // 原始调用
        Calculator add = new Add();
        add.exec(1, 2);
        Calculator sub = new Sub();
        sub.exec(5, 2);
        // 使用策略模式后
        CalStrategy strategy = new CalStrategy(new Add());
        strategy.exec(1, 2);
        strategy = new CalStrategy(new Sub());
        strategy.exec(5, 2);
    }
}
