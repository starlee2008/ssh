package cap.dao.impl;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AdminDAOXImpl extends JdbcDaoSupport implements AdminDAO {


    public class MyRowMapper implements RowMapper<Admin> {

        @Override
        public Admin mapRow(ResultSet resultSet, int i) throws SQLException {
            Admin admin = new Admin();
            admin.setId(resultSet.getInt("id"));
            admin.setUsername(resultSet.getString("username"));
            admin.setPassword(resultSet.getString("password"));
            return admin;
        }
    }

    @Override
    public List<Admin> findAdmins() {
        String sql = "select * from admin order by id";
        return getJdbcTemplate().query(sql, new MyRowMapper());
    }

    @Override
    public Admin findById(int id) {
        String sql = "select * from admin where id=?";
        return getJdbcTemplate().queryForObject(sql, new Object[]{id}, new MyRowMapper());
    }

    @Override
    public int delAdmin(int id) {
        String sql = "delete from admin where id=?";

        return getJdbcTemplate().update(sql, new Object[]{id});
    }

    @Override
    public int addAdmin(Admin admin) {
        String sql = "insert into admin(username,password) values(?,?)";
        return getJdbcTemplate().update(sql, new Object[]{admin.getUsername(), admin.getPassword()});
    }

    @Override
    public int updateAdmin(Admin admin) {
        String sql = "update admin set username=?,password=? where id=?";

        return getJdbcTemplate().update(sql, new Object[]{admin.getUsername(), admin.getPassword(), admin.getId()});
    }
}
