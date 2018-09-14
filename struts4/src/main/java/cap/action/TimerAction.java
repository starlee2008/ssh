package cap.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

@ParentPackage("login")
@Namespace("/")
@InterceptorRefs(@InterceptorRef(value = "mystack"))
@Results({@Result(name = "success", location = "/index.jsp"),
        @Result(name = "login", location = "/login.jsp")})
public class TimerAction extends ActionSupport {

    @Action(value = "count", results = {
            @Result(name = "success", location = "result.jsp")
    })
    public String count() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
