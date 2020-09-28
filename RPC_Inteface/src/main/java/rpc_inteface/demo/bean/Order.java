package rpc_inteface.demo.bean;

import java.util.Date;

public class Order {
    private String order_id;
    private String user_id;
    private String order_description;
    private Date order_time;
    private String address;

    public Order(String order_id, String user_id, String order_description, Date order_time, String address) {
        this.order_id = order_id;
        this.user_id = user_id;
        this.order_description = order_description;
        this.order_time = order_time;
        this.address = address;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setOrder_description(String order_description) {
        this.order_description = order_description;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public String getOrder_id() {
        return order_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getOrder_description() {
        return order_description;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
