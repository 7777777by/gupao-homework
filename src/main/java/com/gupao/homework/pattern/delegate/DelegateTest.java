package com.gupao.homework.pattern.delegate;

/**
 * @author liuyang
 * @date 2019/4/18 20:20
 * @description
 */
public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("UI", new Leader());
    }
}
