package com.gupao.homework.pattern.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyang
 * @date 2019/4/21 15:48
 * @description
 */
public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        try {
            // 1.获取数据库连接
            Connection connection = this.getConnection();
            // 2.创建语句集
            PreparedStatement pstm = this.createPrepareStatement(connection, sql);
            // 3.执行语句集
            ResultSet rs = this.executeQuery(pstm, values);
            // 4.处理结果集
            List<Object> result = this.prepareResultSet(rs, rowMapper);
            // 5.关闭结果集
            this.closeResultSet(rs);
            // 6.关闭语句集
            this.closePrepareStatement(pstm);
            // 7.关闭连接
            this.closeConnection(connection);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void closeConnection(Connection connection) throws Exception {
        connection.close();
    }

    private void closePrepareStatement(PreparedStatement pstm) throws Exception {
        pstm.close();
    }

    private void closeResultSet(ResultSet rs) throws Exception {
        rs.close();
    }

    private List<Object> prepareResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<Object>();
        int rowNum = 1;
        while (rs.next()) {
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    private ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws Exception {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i, values[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPrepareStatement(Connection connection, String sql) throws Exception {
        return connection.prepareStatement(sql);
    }

    private Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }
}
