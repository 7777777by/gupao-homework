package com.gupao.homework.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyang
 * @date 2019/4/18 20:17
 * @description
 */
public class Leader {
    private Map<String, IEmp> map = new HashMap<String, IEmp>();

    public Leader() {
        map.put("加密", new EmpA());
        map.put("UI", new EmpB());
    }

    public void doSomething(String command) {
        this.map.get(command).doing(command);
    }
}
