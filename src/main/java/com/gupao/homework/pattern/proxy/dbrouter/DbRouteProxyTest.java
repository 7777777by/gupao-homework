package com.gupao.homework.pattern.proxy.dbrouter;

import com.gupao.homework.pattern.proxy.dbrouter.proxy.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liuyang
 * @date 2019/4/15 19:52
 * @description
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            IOrderService orderService = new OrderService();
            OrderServiceStaticProxy proxy = new OrderServiceStaticProxy(orderService);
            Order order = new Order();
            order.setCreateDate(new Date());
            proxy.createOrder(order);
            order.setCreateDate(sdf.parse("2010/05/20"));
            proxy.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
