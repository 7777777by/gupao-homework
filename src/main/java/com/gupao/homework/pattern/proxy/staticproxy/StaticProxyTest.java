package com.gupao.homework.pattern.proxy.staticproxy;

/**
 * @author liuyang
 * @date 2019/4/15 19:30
 * @description
 * 静态代理需要把被代理对象传递给代理对象，并且他们都要实现同一接口的被代理方法
 * 如果客户要卖房子，则代理类和接口都应该增加卖房子的方法，违背开闭原则
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        // 小明找房子
        Customer xiaoming = new Customer();
        // 中介需要知道客户信息，所以将小明传递给中介
        Lianjia lj = new Lianjia(xiaoming);
        // 中介开始给小明找房子
        lj.findHouse();
        System.out.println("=====================");
        // 小张找房子
        Customer xiaozhang = new Customer();
        // 中介需要知道客户信息，所以将小张传递给中介
        lj = new Lianjia(xiaozhang);
        // 中介开始给小张找房子
        lj.findHouse();
    }
}
