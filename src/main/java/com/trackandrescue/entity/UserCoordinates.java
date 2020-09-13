package com.trackandrescue.entity;

import org.json.JSONArray;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/21/20
 * Time: 5:39 PM
 */
public class UserCoordinates {
    private int id;
    private int uid;//user id
    private int pid;//police station id
    private int active;//1 vaye active natra inactive
    private int noOfClick;
    private double xCoordinates;
    private double yCoordinates;

    public  UserCoordinates(){

    }



    public int getNoOfClick() {
        return noOfClick;
    }

    public void setNoOfClick(int noOfClick) {
        this.noOfClick = noOfClick;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public double getxCoordinates() {
        return xCoordinates;
    }

    public void setxCoordinates(double xCoordinates) {
        this.xCoordinates = xCoordinates;
    }

    public double getyCoordinates() {
        return yCoordinates;
    }

    public void setyCoordinates(double yCoordinates) {
        this.yCoordinates = yCoordinates;
    }
}
