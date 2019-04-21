package com.gupao.homework.pattern.template;

import java.util.Date;

/**
 * @author liuyang
 * @date 2019/4/21 16:00
 * @description
 */
public class Member {
    private String username;
    private String password;
    private int age;
    private Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
