package com.gupao.homework.pattern.strategy;

/**
 * @author liuyang
 * @date 2019/4/21 15:23
 * @description 策略模式与代理模式区别：策略模式的封装角色与被封装角色的策略类不用是同一个接口
 * 如果是同一个接口，那就是代理模式了
 */
public class CalStrategy {
    private Calculator calculator;

    public CalStrategy(Calculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a, int b) {
        return this.calculator.exec(a, b);
    }
}
