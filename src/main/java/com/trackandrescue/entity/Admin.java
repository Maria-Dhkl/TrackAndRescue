package com.trackandrescue.entity;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 7/6/20
 * Time: 8:49 PM
 */
public class Admin {
    private int aId;
    private String name;
    private String userName;
    private String password;

    public Admin(int aId, String name, String userName, String password) {
        this.aId = aId;
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    public Admin() {
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
