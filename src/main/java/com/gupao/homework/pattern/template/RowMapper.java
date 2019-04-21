package com.gupao.homework.pattern.template;

import java.sql.ResultSet;

/**
 * @author liuyang
 * @date 2019/4/21 15:47
 * @description ORM映射定制化的接口
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
