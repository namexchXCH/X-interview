package com.xch.interview.pojo;

import java.util.Objects;

/**
 * @ClassName: logUser
 * @author: xiongconghui
 * @date: 2023-04-16 22:31
 **/
public class logUser {
    private String user_id;
    private String password;
    private String phone_number;
    private String net_name;
    private String head_sculpture;


    public logUser() {
    }

    public logUser(String user_id, String password, String phone_number, String net_name, String head_sculpture) {
        this.user_id = user_id;
        this.password = password;
        this.phone_number = phone_number;
        this.net_name = net_name;
        this.head_sculpture = head_sculpture;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getNet_name() {
        return net_name;
    }

    public void setNet_name(String net_name) {
        this.net_name = net_name;
    }

    public String getHead_sculpture() {
        return head_sculpture;
    }

    public void setHead_sculpture(String head_sculpture) {
        this.head_sculpture = head_sculpture;
    }

    @Override
    public String toString() {
        return "logUser{" +
                "user_id='" + user_id + '\'' +
                ", password='" + password + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", net_name='" + net_name + '\'' +
                ", head_sculpture='" + head_sculpture + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        logUser logUser = (logUser) o;
        return user_id.equals(logUser.user_id) &&
                password.equals(logUser.password) &&
                phone_number.equals(logUser.phone_number) &&
                net_name.equals(logUser.net_name) &&
                head_sculpture.equals(logUser.head_sculpture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, password, phone_number, net_name, head_sculpture);
    }
}
