package com.gupao.homework.pattern.observer.guava;

/**
 * @author liuyang
 * @date 2019/4/27 12:27
 * @description
 */
public class Publisher {
    private String name = "GPer生态圈";
    private IStudent student;
    private Question question;

    public Publisher(IStudent student, Question question) {
        this.student = student;
        this.question = question;
    }

    public IStudent getStudent() {
        return student;
    }

    public void setStudent(IStudent student) {
        this.student = student;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
