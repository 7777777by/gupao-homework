package com.gupao.homework.pattern.prototype.deep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyang
 * @date 2019/4/9 20:31
 * @description 深克隆：
 * 两对象之间没有任何瓜葛，你改你的，我改我的，互不影响
 */
public class DeepClone implements Cloneable, Serializable {
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
    public String toString() {
        return "num:" + num + ",str:" + str + ",strList:" + strList;
    }

    @Override
    public DeepClone clone() {
        return deepClone();
    }

    private DeepClone deepClone() {
        DeepClone dc = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            oos.flush();
            oos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            dc = (DeepClone) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dc;
    }
}
