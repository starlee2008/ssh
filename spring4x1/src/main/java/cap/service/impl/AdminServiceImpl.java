package cap.service.impl;

import cap.dao.AdminDAO;
import cap.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminDAO adminDAO;

    @Override
    public String sayHello() {
        return adminDAO.sayHello();
    }
}
