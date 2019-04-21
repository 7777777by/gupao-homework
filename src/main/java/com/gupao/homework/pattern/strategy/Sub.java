package com.gupao.homework.pattern.strategy;

/**
 * @author liuyang
 * @date 2019/4/21 15:21
 * @description
 */
public class Sub implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
