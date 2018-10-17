package cap.service.impl;

import cap.bean.Admin;
import cap.service.AdminService;

public class AdminServiceImpl implements AdminService {
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String sayHello() {
        return "您好：" + admin.getUsername();
    }
}
