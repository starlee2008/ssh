package cap.service.impl;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import cap.service.AdminService;
import cap.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDAO adminDAO;

    @Override
    public PageBean findByPage(int pageNo, int pageSize) {
        PageBean pageBean = new PageBean();
        pageBean.setList(adminDAO.findByPage(pageNo, pageSize));
        pageBean.setTotalRecords(adminDAO.getTotal());
        pageBean.setPageSize(pageSize);
        pageBean.setPageNo(pageNo);
        return pageBean;
    }

    @Override
    public void addAdmin(Admin admin) {
        adminDAO.addAdmin(admin);
    }
}
