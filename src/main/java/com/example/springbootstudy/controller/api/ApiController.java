package com.example.springbootstudy.controller.api;

import com.example.springbootstudy.common.Response;
import com.example.springbootstudy.controller.UserApi;
import com.example.springbootstudy.controller.req.SetUserReq;
import com.example.springbootstudy.model.User;
import com.example.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public Response<List<User>> getUserInfo() {
        List<User> userList = userService.getAllUser(5);
        return Response.getOkResponse(userList);
    }

    @Override
    public Response<Boolean> setUserInfo(SetUserReq req) {
        System.out.println(req.toString());
        return Response.getOkResponse(true);
    }
}
