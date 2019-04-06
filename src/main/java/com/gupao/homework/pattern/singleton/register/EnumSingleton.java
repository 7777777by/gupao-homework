package com.gupao.homework.pattern.singleton.register;

/**
 * @author liuyang
 * @date 2019/4/6 15:12
 * @description 枚举单例
 */
public enum EnumSingleton {
    INSTANCE;

    private Object code;

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
