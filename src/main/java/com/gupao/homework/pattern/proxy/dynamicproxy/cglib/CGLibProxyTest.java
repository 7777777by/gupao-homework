package com.gupao.homework.pattern.proxy.dynamicproxy.cglib;

import com.gupao.homework.pattern.proxy.Person;
import com.gupao.homework.pattern.proxy.dynamicproxy.jdk.CustomerA;

/**
 * @author liuyang
 * @date 2019/4/15 20:11
 * @description
 */
public class CGLibProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new CGLibLianjia().getInstance(CustomerA.class);
        person.findHouse();
    }
}
