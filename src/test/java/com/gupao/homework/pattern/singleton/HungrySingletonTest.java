package com.gupao.homework.pattern.singleton;

import com.gupao.homework.pattern.singleton.hungry.HungrySingleton;

/**
 * @author liuyang
 * @date 2019/4/6 14:59
 * @description
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(HungrySingleton.getInstance());
        }
    }
}
