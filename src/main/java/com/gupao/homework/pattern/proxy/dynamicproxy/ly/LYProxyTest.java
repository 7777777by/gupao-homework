package com.gupao.homework.pattern.proxy.dynamicproxy.ly;

import com.gupao.homework.pattern.proxy.Person;
import com.gupao.homework.pattern.proxy.dynamicproxy.jdk.CustomerA;
import com.gupao.homework.pattern.proxy.dynamicproxy.jdk.JdkLianjia;

/**
 * @author liuyang
 * @date 2019/4/15 20:00
 * @description
 */
public class LYProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new LYLianjia().getInstance(new CustomerA());
        person.findHouse();
    }
}
