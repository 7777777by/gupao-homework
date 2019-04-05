package com.gupao.homework.pattern.factory.factorymethod;

import com.gupao.homework.pattern.factory.IProduct;
import com.gupao.homework.pattern.factory.TV;

/**
 * @author liuyang
 * @date 2019/4/5 18:13
 * @description 电视工厂
 */
public class TVFactory extends IProductFactory {
    @Override
    public IProduct createProduct() {
        return new TV();
    }
}
