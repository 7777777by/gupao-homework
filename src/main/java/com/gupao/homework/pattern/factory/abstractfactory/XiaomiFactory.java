package com.gupao.homework.pattern.factory.abstractfactory;

/**
 * @author liuyang
 * @date 2019/4/5 18:28
 * @description
 */
public class XiaomiFactory implements IProductFactory {
    public ITV createTV() {
        return new XiaomiTV();
    }

    public IFridge createFridge() {
        return new XiaomiFridge();
    }

    public IWasher createWasher() {
        return new XiaomiWasher();
    }
}
