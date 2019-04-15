package com.gupao.homework.pattern.proxy.staticproxy;

import com.gupao.homework.pattern.proxy.Person;

/**
 * @author liuyang
 * @date 2019/4/15 19:26
 * @description 租客
 */
public class Customer implements Person {
    public void findHouse() {
        System.out.println("租客找房子要求：便宜，交通方便，设施齐全");
    }
}
