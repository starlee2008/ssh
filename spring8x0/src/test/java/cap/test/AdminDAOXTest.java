package cap.test;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AdminDAOXTest {
    private ApplicationContext context = null;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testFindAll() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAOX");
        List<Admin> adminList = adminDAO.findAdmins();
        for (Admin admin : adminList) {
            System.out.println(admin.getUsername() + ":" + admin.getPassword());
        }
    }

    @Test
    public void testFindById() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAOX");
        Admin admin = adminDAO.findById(11);
        System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());
    }

    @Test
    public void testAddAdmin() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAOX");
        Admin admin = new Admin("xxx", "xxx");
        int res = adminDAO.addAdmin(admin);
        assert res == 1;
    }

    @Test
    public void testDelAdmin() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAOX");
        int res = adminDAO.delAdmin(18);
        assert res == 1;
    }

    @Test
    public void testUpdateAdmin() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAOX");
        Admin admin = new Admin(13, "xxx111", "xxx111");
        int res = adminDAO.updateAdmin(admin);
        assert res == 1;

    }
}
