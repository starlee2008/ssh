package cap.test;

import cap.bean.Product;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.hibernate.Session;
import org.junit.Test;

import java.util.List;

public class HibernateSQLTest {
    private SessionFactory sessionFactory;

    @Before
    public void init() {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();


    }

    @Test
    public void queryBySQL() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        String sql = "select * from m_product";
        List<Product> productList = session.createSQLQuery(sql).addEntity(Product.class).list();
        for (Product p : productList) {
            System.out.println(p.getName() + ":" + p.getSerialNumber());
        }
        tx.commit();
        session.close();

    }

    @Test
    public void queryBySQLQuery() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<Product> productList = session.getNamedQuery("products").setParameter("name", "%Java%").list();
        for (Product p : productList) {
            System.out.println(p.getName() + ":" + p.getSerialNumber());
        }
        tx.commit();
        session.close();
    }
}
