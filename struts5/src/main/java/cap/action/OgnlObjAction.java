package cap.action;

import cap.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class OgnlObjAction extends ActionSupport {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String ognlObj() {
        user = new User();
        user.setUsername("cap");
        ActionContext ctx = ActionContext.getContext();
        ctx.getApplication().put("msg", "application中的信息");
        ctx.getSession().put("msg", "session中的信息");
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("msg", "request中的信息");
        return SUCCESS;


    }
}
