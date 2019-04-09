package com.gupao.homework.pattern.prototype;

import com.gupao.homework.pattern.prototype.simple.SimpleClone;

/**
 * @author liuyang
 * @date 2019/4/9 20:23
 * @description
 */
public class SimpleCloneTest {
    public static void main(String[] args) {
        try {
            SimpleClone sc = new SimpleClone();
            sc.setNum(123);
            sc.setStr("abc");
            sc.setStrList("张三");
            SimpleClone clone = sc.clone();
            clone.setStrList("李四");
            System.out.println("clone = " + clone.toString());
            System.out.println("原对象：" + sc.toString()); // 修改clone对象的list，原对象的list也随之改变
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
