package com.gupao.homework.pattern.delegate;

/**
 * @author liuyang
 * @date 2019/4/18 20:16
 * @description
 */
public class Boss {
    public void command(String command, Leader leader) {
        leader.doSomething(command);
    }
}
