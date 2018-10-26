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
            System.out.println(admin.getId() + ":" + admin.getUsername());
        }


    }
}
