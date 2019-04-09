package com.gupao.homework.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyang
 * @date 2019/4/9 20:16
 * @description 浅克隆：
 * 只复制基本数据类型和String，引用数据类型与原对象指向同一引用地址
 * 修改一个对象的引用类型的值，所有对象的这个引用类型的值都被修改
 */
public class SimpleClone implements Cloneable {
    private int num;
    private String str;
    private List<String> strList = new ArrayList<String>();

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(String value) {
        this.strList.add(value);
    }

    @Override
    public SimpleClone clone() throws CloneNotSupportedException {
        return (SimpleClone) super.clone();
    }

    @Override
    public String toString() {
        return "num:" + num + ",str:" + str + ",strList:" + strList;
    }
}
