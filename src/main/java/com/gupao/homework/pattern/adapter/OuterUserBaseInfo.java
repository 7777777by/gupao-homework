package com.gupao.homework.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyang
 * @date 2019/4/21 16:40
 * @description
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    @Override
    public Map<String, Object> getUserBaseInfo() {
        Map<String, Object> baseInfoMap = new HashMap<String, Object>();
        baseInfoMap.put("username", "外包员工名字...");
        baseInfoMap.put("mobileNumber", "外包员工电话..");
        return baseInfoMap;
    }
}
