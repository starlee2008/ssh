package cap.action;

import com.opensymphony.xwork2.ActionSupport;

public class TimerAction extends ActionSupport {

    public String count() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
