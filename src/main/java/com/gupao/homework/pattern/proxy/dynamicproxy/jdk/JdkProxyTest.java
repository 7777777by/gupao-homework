package com.gupao.homework.pattern.proxy.dynamicproxy.jdk;

import com.gupao.homework.pattern.proxy.Person;

/**
 * @author liuyang
 * @date 2019/4/15 20:00
 * @description
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new JdkLianjia().getInstance(new CustomerA());
        person.findHouse();
    }
}
