package com.gupao.homework.pattern.observer.guava;

/**
 * @author liuyang
 * @date 2019/4/27 12:25
 * @description
 */
public class TeacherA implements ITeacher {
    private String name;

    public TeacherA(String name) {
        this.name = name;
    }

    public void update(Publisher publisher) {
        System.out.println(this.name + " 老师您好，" + publisher.getQuestion().getUsername() +
                "在" + publisher.getName() + "上发布了一个问题，邀请您进行解答。问题内容是：" +
                publisher.getQuestion().getContent());
    }
}
