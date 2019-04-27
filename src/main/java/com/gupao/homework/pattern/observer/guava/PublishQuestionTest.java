package com.gupao.homework.pattern.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author liuyang
 * @date 2019/4/27 12:32
 * @description
 */
public class PublishQuestionTest {
    public static void main(String[] args) {
        IStudent studentA = new StudentA();
        Question question = studentA.publishQuestion("装饰者模式和适配器模式有什么区别？");
        Publisher publisher = new Publisher(studentA, question);
        EventBus eventBus = new EventBus();
        ITeacher Tom = new TeacherA("Tom");
        eventBus.register(Tom);
        eventBus.post(publisher);
    }
}
