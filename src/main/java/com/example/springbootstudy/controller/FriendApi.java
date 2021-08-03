package com.example.springbootstudy.controller;

import com.example.springbootstudy.common.Response;
import com.example.springbootstudy.controller.req.StarUserReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author zjianfa
 */
@Api(value = "Friend 好友关系")
public interface FriendApi {

    @ApiOperation("关注他人 或者加好友")
    @PostMapping(value = "/friend/star-user", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> starUser(@RequestBody @Validated StarUserReq req);



}
