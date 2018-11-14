package cap.service.impl;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import cap.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDAO adminDAO;

    @Override
    public List<Admin> findAdmins() {
        return adminDAO.findAdmins();
    }
}
