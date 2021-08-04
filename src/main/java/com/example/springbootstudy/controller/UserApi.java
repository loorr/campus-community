package com.example.springbootstudy.controller;

import com.example.springbootstudy.common.Response;
import com.example.springbootstudy.controller.req.SetUserReq;
import com.example.springbootstudy.controller.vo.UserInfoVo;
import com.example.springbootstudy.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author zjianfa
 */
@Api(value = "User 接口")
public interface UserApi {

    @ApiOperation("注册系统")
    @GetMapping(value = "/user/sign-in", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Void> signIn(User user);

    @ApiOperation("登录系统")
    @GetMapping(value = "/user/login-in", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Void> loginIn(User user);

    @ApiOperation("登出系统")
    @GetMapping(value = "/user/login-out", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Void> loginOut(User user);

    @ApiOperation("获取全部用户")
    @GetMapping(value = "/user/get-all-user-list", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<List<User>> getAllUserList();

    @ApiOperation("获取个人信息")
    @GetMapping(value = "/user/get-person-info", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<UserInfoVo> getPersonInfo();

    @ApiOperation("新增用户")
    @PostMapping(value = "/user/set-user-info", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> setUserInfo(@RequestBody SetUserReq req);

    @ApiOperation("用户修改个人信息")
    @PostMapping(value = "/user/modified-user-info", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> modifiedUserInfo(@RequestBody SetUserReq req);
}
