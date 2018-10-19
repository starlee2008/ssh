package cap.test;

import cap.dao.AdminDAO;
import cap.service.AdminService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminDAOtest {
    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testSayHello() {
        AdminService adminDAO = (AdminService) context.getBean("adminService");
        System.out.println(adminDAO.sayHello());

    }
}
