package com.gupao.homework.pattern.factory.simpleFactory;

import com.gupao.homework.pattern.factory.IProduct;

/**
 * @author liuyang
 * @date 2019/4/5 18:06
 * @description
 */
public class ProductFactory {
    public static IProduct createProduct(Class clazz) {
        try {
            if (clazz != null) {
                return (IProduct) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
