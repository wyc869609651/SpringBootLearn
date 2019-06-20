package com.rabbitmq.receiver.model;

import java.io.Serializable;

public class UserBean implements Serializable {
    private String userName;
    private String password;

    public UserBean(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{userName="+userName+",password="+password+"}";
    }
}
