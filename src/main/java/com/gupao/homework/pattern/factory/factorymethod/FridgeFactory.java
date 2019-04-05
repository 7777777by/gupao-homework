package com.gupao.homework.pattern.factory.factorymethod;

import com.gupao.homework.pattern.factory.Fridge;
import com.gupao.homework.pattern.factory.IProduct;

/**
 * @author liuyang
 * @date 2019/4/5 18:14
 * @description 冰箱工厂
 */
public class FridgeFactory extends IProductFactory {
    @Override
    public IProduct createProduct() {
        return new Fridge();
    }
}
