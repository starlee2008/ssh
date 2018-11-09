package cap.dao.impl;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AdminDAOImpl implements AdminDAO {
    private class MyRowMapper implements RowMapper<Admin> {

        @Override
        public Admin mapRow(ResultSet resultSet, int i) throws SQLException {
            Admin admin = new Admin();
            admin.setId(resultSet.getInt("id"));
            admin.setUsername(resultSet.getString("username"));
            admin.setPassword(resultSet.getString("password"));
            return admin;
        }
    }

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Admin> findByPage(int pageNo, int pageSize) {
        String sql = "select * from admin limit ?,?";
        int start = (pageNo - 1) * pageSize;
        return jdbcTemplate.query(sql, new Object[]{start, pageSize}, new MyRowMapper());

    }

    @Override
    public int getTotal() {
        String sql = "select count(*) from admin";
        return jdbcTemplate.queryForObject(sql, Integer.class);

    }

    @Override
    public int addAdmin(Admin admin) {
        String sql = "insert into admin(username,password) values(?,?)";
        return jdbcTemplate.update(sql, new Object[]{admin.getUsername(), admin.getPassword()});
    }
}
