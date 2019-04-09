package com.gupao.homework.pattern.prototype;

import com.gupao.homework.pattern.prototype.deep.DeepClone;

/**
 * @author liuyang
 * @date 2019/4/9 20:45
 * @description
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        try {
            DeepClone dc = new DeepClone();
            dc.setNum(123);
            dc.setStr("abc");
            dc.setStrList("张三");
            DeepClone clone = dc.clone();
            clone.setStrList("李四");
            System.out.println("clone = " + clone.toString());
            System.out.println("原对象 = " + dc.toString()); // 原对象list没有随着clone对象的list的改变而改变
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
