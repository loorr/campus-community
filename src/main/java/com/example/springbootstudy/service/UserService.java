package com.example.springbootstudy.service;

import com.example.springbootstudy.controller.req.SignInReq;
import com.example.springbootstudy.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser(int size);

    Long signUser(SignInReq req);

    Boolean addUser(User user);

    User findUserByUid(Long uid);

    User findUserByEmail(String email);
}
