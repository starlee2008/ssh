package cap.test;

import cap.bean.Customer;
import cap.bean.Order;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class One2ManyBothWayTest {
    private SessionFactory sessionFactory;

    @Before
    public void init() {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    @Test
    public void addTest() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Customer customer = new Customer("Benton", "1390000000", "四川成都");
        Order order1 = new Order("0001", new Date());
        Order order2 = new Order("0002", new Date());
        order1.setCustomer(customer);
        order2.setCustomer(customer);
        customer.getOrders().add(order1);
        customer.getOrders().add(order2);
        session.save(customer);
        session.save(order1);
        session.save(order2);
        tx.commit();
        session.close();
    }

}
