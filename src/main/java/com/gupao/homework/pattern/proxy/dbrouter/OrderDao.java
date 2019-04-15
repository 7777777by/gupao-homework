package com.gupao.homework.pattern.proxy.dbrouter;

/**
 * @author liuyang
 * @date 2019/4/15 19:40
 * @description
 */
public class OrderDao {
    public void insert(Order order) {
        System.out.println("OrderDao创建Order成功！");
    }
}
