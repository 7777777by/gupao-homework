package com.gupao.homework.pattern.strategy;

/**
 * @author liuyang
 * @date 2019/4/21 15:21
 * @description 加法
 */
public class Add implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
