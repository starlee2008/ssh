package cap.dao;

import cap.bean.Admin;

import java.util.List;

public interface AdminDAO {
    List<Admin> findByPage(int pageNo, int pageSize);

    int getTotal();

    void addAdmin(Admin admin);

}
