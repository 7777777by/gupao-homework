package com.gupao.homework.pattern.observer.guava;

/**
 * @author liuyang
 * @date 2019/4/27 12:23
 * @description
 */
public class Question {
    private String username;
    private String content;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Question(String username, String content) {
        this.username = username;
        this.content = content;
    }
}
