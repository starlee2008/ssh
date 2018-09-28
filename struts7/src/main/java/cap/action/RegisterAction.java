package cap.action;

import cap.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
    private User user;


    public String register() {
        return SUCCESS;

    }
    /*

    public void validateRegister(){
        if(user.getUsername()==null||user.getUsername().equals("")){
            this.addFieldError("user.username",getText("name.null"));
        }
        if(user.getUsername().length()<6||user.getUsername().length()>16){
            this.addFieldError("user.username",getText("name.length"));
        }
        if(user.getPassword()==null||user.getPassword().equals("")){
            this.addFieldError("user.password",getText("password.null"));
        }

    }
    */

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
