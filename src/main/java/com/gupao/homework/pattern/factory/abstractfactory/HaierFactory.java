package com.gupao.homework.pattern.factory.abstractfactory;

/**
 * @author liuyang
 * @date 2019/4/5 18:20
 * @description 海尔工厂
 */
public class HaierFactory implements IProductFactory {
    // 生产电视
    public ITV createTV() {
        return new HaierTV();
    }
    // 生产冰箱
    public IFridge createFridge() {
        return new HaierFridge();
    }
    // 生产洗衣机
    public IWasher createWasher() {
        return new HaierWasher();
    }
}
