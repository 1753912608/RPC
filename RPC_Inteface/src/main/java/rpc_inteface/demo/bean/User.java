package rpc_inteface.demo.bean;

import java.util.List;

public class User {
    private String user_id;
    private String user_name;
    private String sex;
    private List<String>address;

    public User(String user_id, String user_name, String sex, List<String> address) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.sex = sex;
        this.address = address;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getSex() {
        return sex;
    }

    public List<String> getAddress() {
        return address;
    }
}
