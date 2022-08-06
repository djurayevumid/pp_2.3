package com.djurayevumid.application.dao;

import com.djurayevumid.application.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(int id);

//    public User updateUser(User user);
    public void deleteUser(int id);

}
