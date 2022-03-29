package com.example.pp_3_1_1_springboot.service;

import com.example.pp_3_1_1_springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    void deleteUserById(int id);

    User updateUser(User user);

    void addUser(User user);

    User getUserById(int id);
}
