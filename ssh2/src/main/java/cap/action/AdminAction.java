package cap.action;

import cap.bean.Admin;
import cap.service.AdminService;
import cap.util.PageBean;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
@Namespace("/")
@Scope(value = "prototype")
public class AdminAction extends ActionSupport {
    private PageBean pageBean;
    @Resource
    private AdminService adminService;
    private int pageNo = 1;
    private Admin admin;


    @Action(value = "list", results = {@Result(name = "success", location = "/listAdmin.jsp")})
    public String list() {
        pageBean = adminService.findByPage(pageNo, 5);
        return SUCCESS;
    }

    @Action(value = "add", results = {@Result(name = "success", type = "redirect", location = "list")})
    public String add() {
        adminService.addAdmin(admin);
        return SUCCESS;

    }

    public PageBean getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean) {
        this.pageBean = pageBean;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
