package cap.bean;

import java.util.HashSet;
import java.util.Set;

public class Product {
    private Integer id;// 产品 id
    private String name;// 产品名称
    private String serialNumber;// 产品序列号
    private double price;// 产品价格
    private int stock;// 产品库存量
    private Set<OrderItem> orderItems = new HashSet<OrderItem>();// 订单项

    public Product() {
    }

    public Product(String name, String serialNumber, double price, int stock) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.price = price;
        this.stock = stock;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
