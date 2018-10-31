package cap.dao;

import cap.bean.Admin;

import java.util.List;

public interface AdminDAO {
    List<Admin> findAdmins();

    Admin findById(int id);

    int delAdmin(int id);

    int addAdmin(Admin admin);

    int updateAdmin(Admin admin);
}
