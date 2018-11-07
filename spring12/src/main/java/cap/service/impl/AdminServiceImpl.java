package cap.service.impl;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import cap.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    private AdminDAO adminDAO;

    public AdminDAO getAdminDAO() {
        return adminDAO;
    }

    public void setAdminDAO(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }

    @Override
    public List<Admin> findAdmins() {
        return adminDAO.findAdmins();
    }

    @Override
    public Admin findById(int id) {
        return adminDAO.findById(id);
    }

    @Override
    public int addAdmin(Admin admin) {
        return adminDAO.addAdmin(admin);
    }

    @Override
    public int delAdmin(int id) {
        return adminDAO.delAdmin(id);
    }

    @Override
    public int updateAdmin(Admin admin) {
        return adminDAO.updateAdmin(admin);
    }
}
