package com.liu.domain;
import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String username;

    public User(Integer id, String username, String tel, String password, String email) {
        this.id = id;
        this.username = username;
        this.tel = tel;
        this.password = password;
        this.email = email;
    }

    private String tel;
    private String password;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username,  String password,String tel,String email) {
        this.email=email;
        this.username = username;
        this.tel = tel;
        this.password = password;
    }

    public User() {}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", tel='" + tel + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
