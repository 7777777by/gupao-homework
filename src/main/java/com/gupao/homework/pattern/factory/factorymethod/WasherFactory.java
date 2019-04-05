package com.gupao.homework.pattern.factory.factorymethod;

import com.gupao.homework.pattern.factory.IProduct;
import com.gupao.homework.pattern.factory.Washer;

/**
 * @author liuyang
 * @date 2019/4/5 18:14
 * @description 洗衣机工厂
 */
public class WasherFactory extends IProductFactory {
    @Override
    public IProduct createProduct() {
        return new Washer();
    }
}
