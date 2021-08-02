package com.example.springbootstudy.service;

import com.example.springbootstudy.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser(int size);

    Boolean addUser(User user);
}
