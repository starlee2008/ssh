package cap.dao.impl;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import cap.db.DBCon;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AdminDAOImpl implements AdminDAO {
    private DBCon dbCon = null;

    @Override
    public List<Admin> findAdmins() {
        List<Admin> adminList = new ArrayList<>();
        try {
            dbCon = new DBCon();
            String sql = "select * from admin";
            ResultSet resultSet = dbCon.doQuery(sql, new Object[]{});
            while (resultSet.next()) {
                Admin admin = new Admin();
                admin.setId(resultSet.getInt("id"));
                admin.setUsername(resultSet.getString("username"));
                admin.setPassword(resultSet.getString("password"));
                adminList.add(admin);
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            dbCon.close();
        }
        return adminList;
    }

    @Override
    public Admin findById(int id) {
        Admin admin = null;
        try {
            dbCon = new DBCon();
            String sql = "select * from admin where id=?";
            ResultSet resultSet = dbCon.doQuery(sql, new Object[]{id});
            if (resultSet.next()) {
                admin = new Admin();
                admin.setId(resultSet.getInt("id"));
                admin.setUsername(resultSet.getString("username"));
                admin.setPassword(resultSet.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            dbCon.close();
        }
        return admin;
    }

    @Override
    public int addAdmin(Admin admin) {
        int result = -1;
        try {
            dbCon = new DBCon();
            String sql = "insert into admin(username,password) values(?,?)";
            result = dbCon.doUpdate(sql, new Object[]{admin.getUsername(), admin.getPassword()});
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbCon.close();
        }
        return result;
    }

    @Override
    public int delAdmin(int id) {
        int result = -1;
        try {
            dbCon = new DBCon();
            String sql = "delete from admin where id=?";
            result = dbCon.doUpdate(sql, new Object[]{id});
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbCon.close();
        }
        return result;
    }

    @Override
    public int updateAdmin(Admin admin) {
        int result = -1;
        try {
            dbCon = new DBCon();
            String sql = "update admin set username=?,password=? where id=?";
            result = dbCon.doUpdate(sql, new Object[]{admin.getUsername(), admin.getPassword(), admin.getId()});
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbCon.close();
        }
        return result;
    }
}
