package com.example.springbootstudy.controller;

import com.example.springbootstudy.common.Response;
import com.example.springbootstudy.controller.req.GetAllFriendReq;
import com.example.springbootstudy.controller.req.StarUserReq;
import com.example.springbootstudy.controller.vo.FriendShipVo;
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
    @PostMapping(value = "/friend/add-friend", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> addFriend(@RequestBody @Validated StarUserReq req);

    @ApiOperation("删除好友")
    @PostMapping(value = "/friend/delete-friend", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> deleteFriend(@RequestBody @Validated StarUserReq req);

    @ApiOperation("获取用户的所有好友")
    @PostMapping(value = "/friend/get-friend", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<FriendShipVo> getAllFriend(@RequestBody @Validated GetAllFriendReq req);

}
