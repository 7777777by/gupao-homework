package com.gupao.homework.pattern.proxy.staticproxy;

import com.gupao.homework.pattern.proxy.Person;

/**
 * @author liuyang
 * @date 2019/4/15 19:27
 * @description 链家
 */
public class Lianjia implements Person {
    private Customer customer;

    public Lianjia(Customer customer) {
        this.customer = customer;
    }

    public void findHouse() {
        before();
        this.customer.findHouse();
        after();
    }

    private void before() {
        System.out.println("前置增强方法：了解客户需求，开始查找房源...");
    }

    private void after() {
        System.out.println("后置增强方法：找到符合客户要求的房子了。");
    }
}
