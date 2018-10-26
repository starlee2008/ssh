package cap.dao;

import cap.bean.Admin;
import cap.util.DBUtil;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AdminDAOImpl implements AdminDAO {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(DBUtil.getDataSource());

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
        List<Admin> adminList = jdbcTemplate.query(sql, new MyRowMapper());
        return adminList;
    }
}
