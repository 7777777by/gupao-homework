package com.gupao.homework.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyang
 * @date 2019/4/21 16:41
 * @description
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    @Override
    public Map<String, Object> getUserHomeInfo() {
        Map<String, Object> homeInfoMap = new HashMap<String, Object>();
        homeInfoMap.put("address", "外包员工地址...");
        homeInfoMap.put("homeTelNumber", "外包员工家庭座机..");
        return homeInfoMap;
    }
}
