package com.gupao.homework.pattern.singleton;

import com.gupao.homework.pattern.singleton.register.EnumSingleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author liuyang
 * @date 2019/4/6 15:14
 * @description
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton o1 = null;
        EnumSingleton o2 = EnumSingleton.getInstance();
        o2.setCode(new Object());
        try {
            // 序列化o2到磁盘
            FileOutputStream fos = new FileOutputStream("EnumSingleton.java");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(o2);
            oos.flush();
            oos.close();

            // 反序列化从磁盘读取
            FileInputStream fis = new FileInputStream("EnumSingleton.java");
            ObjectInputStream ois = new ObjectInputStream(fis);
            o1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(o1.getCode());
            System.out.println(o2.getCode());
            System.out.println(o1.getCode() == o2.getCode()); // true
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public static void main(String[] args) {
        try {
            Class<EnumSingleton> clazz = EnumSingleton.class;
            Constructor<EnumSingleton> declaredConstructor = clazz.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            EnumSingleton enumSingleton = declaredConstructor.newInstance();
            EnumSingleton instance = EnumSingleton.getInstance();
            System.out.println(enumSingleton == instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
