package com.gupao.homework.pattern.proxy.dynamicproxy.jdk;

import com.gupao.homework.pattern.proxy.Person;

/**
 * @author liuyang
 * @date 2019/4/15 20:01
 * @description
 */
public class CustomerA implements Person {
    public void findHouse() {
        System.out.println("租客找房子要求：便宜，交通方便，设施齐全");
    }
}
