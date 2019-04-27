package com.gupao.homework.pattern.observer.guava;

/**
 * @author liuyang
 * @date 2019/4/27 12:23
 * @description
 */
public class StudentA implements IStudent {
    private String name = "studentA";

    public String getName() {
        return name;
    }

    public Question publishQuestion(String content) {
        return new Question(this.name, content);
    }
}
