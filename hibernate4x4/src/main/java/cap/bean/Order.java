package cap.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order {
    private Integer id;// 订单 id
    private String orderNumber;// 订单号63
    private Date date;// 下单时间
    private Set<OrderItem> orderItems = new HashSet<>();
    private Customer customer;// 客户

    public Order() {
    }

    public Order(String orderNumber, Date date) {
        this.orderNumber = orderNumber;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
