package cap.service;

import cap.bean.Admin;
import cap.util.PageBean;

public interface AdminServicce {
    PageBean findByPage(int pageNo, int pageSize);

    int addAdmin(Admin admin);
}
