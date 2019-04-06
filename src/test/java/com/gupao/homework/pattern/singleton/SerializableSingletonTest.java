package com.gupao.homework.pattern.singleton;

import com.gupao.homework.pattern.singleton.serializable.SerializableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author liuyang
 * @date 2019/4/6 16:05
 * @description
 */
public class SerializableSingletonTest {
    public static void main(String[] args) {
        try {
            Object o1 = null;
            Object o2 = SerializableSingleton.getInstance();

            // 序列化
            FileOutputStream fos = new FileOutputStream("SerializableSingleton.java");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(o2);
            fos.close();
            oos.flush();
            oos.close();

            // 反序列化
            FileInputStream fis = new FileInputStream("SerializableSingleton.java");
            ObjectInputStream ois = new ObjectInputStream(fis);
            o1 = ois.readObject();
            fis.close();
            ois.close();

            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
