package com.gupao.homework.pattern.proxy.dbrouter.db;

/**
 * @author liuyang
 * @date 2019/4/15 19:47
 * @description
 */
public class DynamicDataSourceEntity {
    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<String>();

    private DynamicDataSourceEntity() {};

    public static String get() {
        return THREAD_LOCAL.get();
    }

    public static void set(String resource) {
        THREAD_LOCAL.set(resource);
    }

    public static void set(int year) {
        THREAD_LOCAL.set("DB_【" + year + "】");
    }

    public static void reStore() {
        THREAD_LOCAL.set(null);
    }
}
