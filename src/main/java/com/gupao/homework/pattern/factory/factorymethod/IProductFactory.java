package com.gupao.homework.pattern.factory.factorymethod;

import com.gupao.homework.pattern.factory.IProduct;

/**
 * @author liuyang
 * @date 2019/4/5 18:12
 * @description
 */
public abstract class IProductFactory {
    public abstract IProduct createProduct();
}
