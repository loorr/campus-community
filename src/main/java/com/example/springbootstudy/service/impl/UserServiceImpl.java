package com.example.springbootstudy.service.impl;

import com.example.springbootstudy.common.ChatException;
import com.example.springbootstudy.common.IdGenerator;
import com.example.springbootstudy.common.ErrorCode;
import com.example.springbootstudy.controller.req.SignInReq;
import com.example.springbootstudy.dao.UserMapper;
import com.example.springbootstudy.model.User;
import com.example.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zjianfa
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser(int size) {
        return userMapper.getAllUser(size);
    }

    @Override
    public Long signUser(SignInReq req) {
        Long uid;
        try {
            User user = new User();
            uid = IdGenerator.getUid();
            user.setUid(uid);
            user.setPassword(req.getPassword());
            user.setEmail(req.getEmail());
            user.setNickname(req.getNickname());
            userMapper.insertOne(user);
        }catch (DuplicateKeyException e){
            throw  new ChatException(ErrorCode.AUTH_ERROR);
        }
        return uid;
    }

    @Override
    public Boolean addUser(User user) {
        int row = userMapper.insertOne(user);
        if (row == 1){
            return true;
        }
        return false;
    }

    @Override
    public User findUserByUid(Long uid) {
        return userMapper.getUserByEmailOrUid(null, uid);
    }

    @Override
    public User findUserByEmail(String email) {
        return userMapper.getUserByEmailOrUid(email, null);
    }


}
