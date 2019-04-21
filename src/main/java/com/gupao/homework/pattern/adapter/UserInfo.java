package com.gupao.homework.pattern.adapter;

/**
 * @author liuyang
 * @date 2019/4/21 16:31
 * @description
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUsername() {
        System.out.println("员工姓名...");
        return null;
    }

    @Override
    public String getAddress() {
        System.out.println("员工地址...");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("员工手机号码...");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("员工办公室座机...");
        return null;
    }

    @Override
    public String getPosition() {
        System.out.println("员工职位...");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("员工家庭座机...");
        return null;
    }
}
