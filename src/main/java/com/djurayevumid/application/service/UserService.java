package com.djurayevumid.application.service;


import com.djurayevumid.application.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);
    public User updateUser(User user);

    public void deleteUser(int id);
}
