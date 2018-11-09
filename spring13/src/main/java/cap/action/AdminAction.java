package cap.action;

import cap.bean.Admin;
import cap.service.AdminServicce;
import cap.util.PageBean;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
@Namespace(value = "/")
@Scope(value = "prototype")
public class AdminAction extends ActionSupport {
    @Resource
    private AdminServicce adminServicce;
    private PageBean pageBean;
    private int pageNo = 1;
    private Admin admin;

    @Action(value = "lists", results = {@Result(name = "success", location = "/listAdmin.jsp"),
            @Result(name = "error", location = "/error.jsp")})
    public String lists() {
        pageBean = adminServicce.findByPage(pageNo, 5);
        if (pageBean != null)
            return SUCCESS;
        else
            return ERROR;

    }

    @Action(value = "add", results = {@Result(name = "success", type = "redirect", location = "/lists"),
            @Result(name = "error", location = "/error.jsp")})
    public String add() {
        int res = adminServicce.addAdmin(admin);
        if (res > 0)
            return SUCCESS;
        else
            return ERROR;
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
