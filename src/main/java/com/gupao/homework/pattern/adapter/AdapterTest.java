package com.gupao.homework.pattern.adapter;

/**
 * @author liuyang
 * @date 2019/4/21 16:53
 * @description
 */
public class AdapterTest {
    public static void main(String[] args) {
        // 外包人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();

        IUserInfo userInfo = new OuterUserInfoAdapter(baseInfo, officeInfo, homeInfo);
        System.out.println(userInfo.getUsername());
    }
}
