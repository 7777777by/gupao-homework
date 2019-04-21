package com.gupao.homework.pattern.delegate;

/**
 * @author liuyang
 * @date 2019/4/18 20:18
 * @description
 */
public class EmpA implements IEmp {
    @Override
    public void doing(String command) {
        System.out.println("我是小A，擅长加密");
    }
}
