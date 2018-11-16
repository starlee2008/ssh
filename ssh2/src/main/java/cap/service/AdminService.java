package cap.service;

import cap.bean.Admin;
import cap.util.PageBean;

public interface AdminService {
    PageBean findByPage(int pageNo, int pageSize);

    void addAdmin(Admin admin);
}
