package cap.action;

import cap.bean.Admin;
import cap.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Namespace("/")
@Scope(value = "prototype")
public class AdminAction extends ActionSupport {
    @Resource
    private AdminService adminService;
    private List<Admin> adminList;

    @Action(value = "list", results = {@Result(name = "success", location = "/listAdmin.jsp")})
    public String list() {
        adminList = adminService.findAdmins();
        return SUCCESS;

    }

    public List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> adminList) {
        this.adminList = adminList;
    }
}
