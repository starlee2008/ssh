package cap.bean;

import java.util.Date;

public class Order {
    private int id;
    private String orderNo;
    private Date date;
    private Customer customer;

    public Order() {
    }

    public Order(String orderNo, Date date) {
        this.orderNo = orderNo;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
