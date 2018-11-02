package cap.test;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AdminDAOTest {
    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testFindAll() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        List<Admin> adminList = adminDAO.findAdmins();
        for (Admin admin : adminList) {
            System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());
        }
    }

    @Test
    public void testFindById() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        Admin admin = adminDAO.findById(4);
        System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());
    }

    @Test
    public void testUpdateAdmin() {
        Admin admin = new Admin(4, "cap", "cap");
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        int res = adminDAO.updateAdmin(admin);
        assert res == 1;
    }

    @Test
    public void testAddAdmin() {
        Admin admin = new Admin("helloxxx", "hellxxx");
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        int res = adminDAO.addAdmin(admin);
        assert res == 1;
    }

}
