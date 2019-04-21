package com.gupao.homework.pattern.template.dao;

import com.gupao.homework.pattern.template.JdbcTemplate;
import com.gupao.homework.pattern.template.Member;
import com.gupao.homework.pattern.template.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author liuyang
 * @date 2019/4/21 16:01
 * @description
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setBirthday(rs.getDate("birthday"));
                return member;
            }
        }, null);
    }
}
