package com.gupao.homework.pattern.adapter;

/**
 * @author liuyang
 * @date 2019/4/21 16:23
 * @description 甲方人员信息接口
 */
public interface IUserInfo {
    // 获取用户姓名
    String getUsername();
    // 获得家庭地址
    String getAddress();
    // 手机号码
    String getMobileNumber();
    // 公司座机
    String getOfficeTelNumber();
    // 职位
    String getPosition();
    // 家庭座机
    String getHomeTelNumber();
}
