package com.example.springbootstudy.controller.api;

import com.example.springbootstudy.common.Response;
import com.example.springbootstudy.controller.UserApi;
import com.example.springbootstudy.controller.req.SetUserReq;
import com.example.springbootstudy.controller.vo.UserInfoVo;
import com.example.springbootstudy.model.User;
import com.example.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zjianfa
 */
@RestController
public class UserController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public Response<Void> signIn(User user) {
        return null;
    }

    @Override
    public Response<Void> loginIn(User user) {
        return null;
    }

    @Override
    public Response<Void> loginOut(User user) {
        return null;
    }

    @Override
    public Response<List<User>> getAllUserList() {
        List<User> userList = userService.getAllUser(5);
        return Response.getOk(userList);
    }

    @Override
    public Response<UserInfoVo> getPersonInfo() {
        // TODO
        return null;
    }

    @Override
    public Response<Boolean> setUserInfo(SetUserReq req) {
        System.out.println(req.toString());
        return Response.getOk(true);
    }

    @Override
    public Response<Boolean> modifiedUserInfo(SetUserReq req) {
        return null;
    }
}
