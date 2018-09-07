package cap.action;

import cap.bean.Admin;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction1 extends ActionSupport implements ModelDriven<Admin> {
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String login() {
        if (admin.getUsername().equals("admin") && admin.getPassword().equals("admin")) {
            return SUCCESS;
        } else
            return ERROR;
    }

    @Override
    public Admin getModel() {
        if (admin == null) {
            admin = new Admin();
        }
        return admin;
    }
}
