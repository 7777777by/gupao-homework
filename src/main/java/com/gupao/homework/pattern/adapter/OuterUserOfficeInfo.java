package com.gupao.homework.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyang
 * @date 2019/4/21 16:41
 * @description
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    @Override
    public Map<String, Object> getUserOfficeInfo() {
        Map<String, Object> officeInfoMap = new HashMap<String, Object>();
        officeInfoMap.put("position", "外包员工职位...");
        officeInfoMap.put("officeTelNumber", "外包员工公司座机..");
        return officeInfoMap;
    }
}
