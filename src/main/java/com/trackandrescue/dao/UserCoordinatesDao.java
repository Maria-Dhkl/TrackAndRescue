package com.trackandrescue.dao;

import com.trackandrescue.entity.UserCoordinates;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: abhinacharya
 * Date: 6/21/20
 * Time: 5:37 PM
 */
public interface UserCoordinatesDao {
    public void addUserCoordinates(UserCoordinates userCoordinates);
    public List<UserCoordinates> getUserCoordinates();
    public UserCoordinates getUserCoordinatesById(int uid);//vayna vane customer ko id haldine hae,ahile maile normal id haleko xu hae

}
