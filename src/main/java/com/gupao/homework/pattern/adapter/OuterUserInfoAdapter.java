package com.gupao.homework.pattern.adapter;

import java.util.Map;

/**
 * @author liuyang
 * @date 2019/4/21 16:42
 * @description
 */
public class OuterUserInfoAdapter implements IUserInfo {
    // 源目标对象
    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserOfficeInfo officeInfo = null;
    private IOuterUserHomeInfo homeInfo = null;
    // 数据处理
    private Map<String, Object> baseMap = null;
    private Map<String, Object> officeMap = null;
    private Map<String, Object> homeMap = null;

    public OuterUserInfoAdapter(IOuterUserBaseInfo baseInfo, IOuterUserOfficeInfo officeInfo, IOuterUserHomeInfo homeInfo) {
        this.baseInfo = baseInfo;
        this.officeInfo = officeInfo;
        this.homeInfo = homeInfo;
        // 数据处理
        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
    }

    @Override
    public String getUsername() {
        return (String) this.baseMap.get("username");
    }

    @Override
    public String getAddress() {
        return (String) this.homeMap.get("address");
    }

    @Override
    public String getMobileNumber() {
        return (String) this.baseMap.get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        return (String) this.officeMap.get("officeTelNumber");
    }

    @Override
    public String getPosition() {
        return (String) this.officeMap.get("position");
    }

    @Override
    public String getHomeTelNumber() {
        return (String) this.homeMap.get("homeTelNumber");
    }
}
