package cap.test;

import cap.dao.AdminDAO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminDAOTest {
    private ApplicationContext context = null;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testSayHi() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        System.out.println(adminDAO.sayHi());

    }
}
