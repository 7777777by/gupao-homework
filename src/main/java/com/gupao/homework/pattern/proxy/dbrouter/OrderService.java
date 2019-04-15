package com.gupao.homework.pattern.proxy.dbrouter;

/**
 * @author liuyang
 * @date 2019/4/15 19:39
 * @description
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao = new OrderDao();

    public void createOrder(Order order) {
        System.out.println("OrderService调用OrderDao创建订单");
        this.orderDao.insert(order);
    }
}
