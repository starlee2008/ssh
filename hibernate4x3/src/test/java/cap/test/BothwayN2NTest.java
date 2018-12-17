package cap.test;

import cap.bean.Order;
import cap.bean.Product;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.hibernate.Session;

import java.util.Date;

public class BothwayN2NTest {
    private SessionFactory sessionFactory;

    @Before
    public void init() {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();

    }

    @Test
    public void testAdd() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Order order1 = new Order("00001", new Date());
        Order order2 = new Order("00002", new Date());
        Product product1 = new Product("Java Web技术", "100001", 60, 100);
        Product product2 = new Product("Java EE技术", "100001", 80, 100);
        order1.getProducts().add(product1);
        order1.getProducts().add(product2);
        order2.getProducts().add(product1);
        product1.getOrders().add(order1);
        product2.getOrders().add(order1);
        product1.getOrders().add(order2);
        session.save(order1);
        session.save(order2);
        session.save(product1);
        session.save(product2);
        tx.commit();
        session.close();
    }
}
