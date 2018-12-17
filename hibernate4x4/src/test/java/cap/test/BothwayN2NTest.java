package cap.test;

import cap.bean.Customer;
import cap.bean.Order;
import cap.bean.OrderItem;
import cap.bean.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

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
        Customer customer1 = new Customer("张三", "四川成都", "13900000000");
        Customer customer2 = new Customer("李四", "四川成都", "13900000000");
        Order order1 = new Order("00001", new Date());
        Order order2 = new Order("00002", new Date());
        Product product1 = new Product("Java Web技术", "100001", 60, 100);
        Product product2 = new Product("Java EE技术", "100001", 80, 100);

        OrderItem orderItem1 = new OrderItem();
        OrderItem orderItem2 = new OrderItem();
        OrderItem orderItem3 = new OrderItem();

        // 设置关联关系
        customer1.getOrders().add(order1);
        customer1.getOrders().add(order2);
        order1.setCustomer(customer1);
        order2.setCustomer(customer1);
        orderItem1.setOrder(order1);
        orderItem2.setOrder(order1);
        orderItem3.setOrder(order2);
        order1.getOrderItems().add(orderItem1);
        order1.getOrderItems().add(orderItem2);
        orderItem1.setProduct(product1);
        orderItem2.setProduct(product2);
        orderItem3.setProduct(product1);
        product1.getOrderItems().add(orderItem1);
        product1.getOrderItems().add(orderItem2);
        product2.getOrderItems().add(orderItem3);

        session.save(customer1);
        session.save(customer2);
        session.save(product1);
        session.save(product2);
        session.save(order1);
        session.save(order2);
        session.save(orderItem1);
        session.save(orderItem2);
        session.save(orderItem3);
        tx.commit();
        session.close();
    }
}
