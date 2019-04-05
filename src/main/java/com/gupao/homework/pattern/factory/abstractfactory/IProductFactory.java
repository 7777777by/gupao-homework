package com.gupao.homework.pattern.factory.abstractfactory;

import com.gupao.homework.pattern.factory.IProduct;

/**
 * @author liuyang
 * @date 2019/4/5 18:18
 * @description
 */
public interface IProductFactory {
    // 生产电视
    ITV createTV();
    // 生产冰箱
    IFridge createFridge();
    // 生产洗衣机
    IWasher createWasher();
}
