package cap.test;

import cap.bean.Customer;
import cap.bean.Order;
import cap.bean.Product;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.hibernate.Session;

import java.util.List;
import java.util.Set;

public class HibernateHQLTest {
    private SessionFactory sessionFactory;

    @Before
    public void init() {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();

    }

    @Test
    public void queryProduct() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        String hql = "select p from Product as p where p.name like '%Java%'";
        List<Product> productList = session.createQuery(hql).list();
        for (Product p : productList) {
            System.out.println(p.getName() + ":" + p.getSerialNumber());
        }

    }

    @Test
    public void queryProductWithPara() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        String hql = "select p from Product as p where p.name like ?";
        List<Product> productList = session.createQuery(hql).setParameter(0, "%Java%").list();
        for (Product p : productList) {
            System.out.println(p.getName() + ":" + p.getSerialNumber());
        }
    }

    @Test
    public void queryProductWithPara1() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        String hql = "select p from Product as p where p.name like :pname";
        List<Product> productList = session.createQuery(hql).setParameter("pname", "%Java%").list();
        for (Product p : productList) {
            System.out.println(p.getName() + ":" + p.getSerialNumber());
        }
    }

    @Test
    public void queryProductWithParas() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        String hql = "select p from Product as p where p.id in (:id)";
        List<Product> productList = session.createQuery(hql).setParameterList("id", new Object[]{1, 3}).list();
        for (Product p : productList) {
            System.out.println(p.getName() + ":" + p.getSerialNumber());
        }
    }

    @Test
    public void queryProductWithPage() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        String hql = "from Product";
        List<Product> productList = session.createQuery(hql).setFirstResult(0).setMaxResults(5).list();
        for (Product p : productList) {
            System.out.println(p.getName() + ":" + p.getSerialNumber());
        }

    }

    @Test
    public void queryOrderAndCustomer() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        String hql = "from Order";
        List<Order> orderList = session.createQuery(hql).list();
        for (Order order : orderList) {
            System.out.println(order.getCustomer().getName());
        }
    }

    @Test
    public void queryOrderAndCustomer1() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Customer customer = session.get(Customer.class, 1);
        Set<Order> orders = customer.getOrders();
        for (Order order : orders) {
            System.out.println(order.getOrderNumber());
        }

    }
}
