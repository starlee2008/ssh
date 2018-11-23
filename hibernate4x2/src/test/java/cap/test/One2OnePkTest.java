package cap.test;

import cap.bean.Address;
import cap.bean.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

public class One2OnePkTest {
    private SessionFactory sessionFactory;

    @Before
    public void init() {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    @Test
    public void testSave() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Customer customer = new Customer("Benton", "1390000000");
        Address address = new Address("成都", "郫县", "610000");
        customer.setAddress(address);
        address.setCustomer(customer);
        session.save(customer);
        session.save(address);
        tx.commit();
        session.close();
    }
}
