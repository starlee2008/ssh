package cap.action;

import cap.bean.Admin;
import cap.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class AdminAction extends ActionSupport {
    private Admin admin;
    private int id;
    private List<Admin> adminList;
    private AdminService adminService;


    public String list() {
        adminList = adminService.findAdmins();
        return SUCCESS;
    }

    public String add() {
        int res = adminService.addAdmin(admin);
        if (res > 0)
            return SUCCESS;
        else
            return ERROR;
    }

    public String del() {
        int res = adminService.delAdmin(id);
        if (res > 0)
            return SUCCESS;
        else
            return ERROR;
    }

    public String update() {
        int res = adminService.updateAdmin(admin);
        if (res > 0)
            return SUCCESS;
        else
            return ERROR;
    }

    public String edit() {
        admin = adminService.findById(id);
        return SUCCESS;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> adminList) {
        this.adminList = adminList;
    }

    public AdminService getAdminService() {
        return adminService;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }
}
