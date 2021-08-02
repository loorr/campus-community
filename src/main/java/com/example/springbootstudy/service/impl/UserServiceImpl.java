package com.example.springbootstudy.service.impl;

import com.example.springbootstudy.dao.UserMapper;
import com.example.springbootstudy.model.User;
import com.example.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser(int size) {
        return userMapper.getAllUser(size);
    }

    @Override
    public Boolean addUser(User user) {
        int row = userMapper.insertOne(user);
        if (row == 1){
            return true;
        }
        return false;
    }


}
