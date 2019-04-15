package com.gupao.homework.pattern.proxy.dbrouter.proxy;

import com.gupao.homework.pattern.proxy.dbrouter.IOrderService;
import com.gupao.homework.pattern.proxy.dbrouter.Order;
import com.gupao.homework.pattern.proxy.dbrouter.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liuyang
 * @date 2019/4/15 19:42
 * @description
 */
public class OrderServiceStaticProxy implements IOrderService {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    public void createOrder(Order order) {
        before(order);
        this.orderService.createOrder(order);
        after();
    }

    private void before(Order order) {
        // 根据订单创建日期切换数据源
        Date createDate = order.getCreateDate();
        Integer createYear = Integer.valueOf(sdf.format(createDate));
        System.out.println("静态代理类自动分配到DB_【" + createYear + "】数据源处理数据");
        DynamicDataSourceEntity.set(createYear);
    }

    private void after() {
        // 恢复默认数据源
        DynamicDataSourceEntity.reStore();
    }
}
