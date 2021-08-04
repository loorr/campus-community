package com.example.springbootstudy.controller;

import com.example.springbootstudy.common.Response;
import com.example.springbootstudy.controller.req.GetGroupMemberReq;
import com.example.springbootstudy.controller.req.JoinOrQuitGroupReq;
import com.example.springbootstudy.controller.req.SearchGroupReq;
import com.example.springbootstudy.controller.req.UpdateGroupNameReq;
import com.example.springbootstudy.controller.vo.GroupInfoVo;
import com.example.springbootstudy.controller.vo.GroupMemberVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author zjianfa
 */
@Api(value = "群组功能")
public interface GroupApi {
    @ApiOperation("用户建群聊")
    @PostMapping(value = "/group/add-group", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> addGroup(@RequestBody @Validated JoinOrQuitGroupReq req);

    @ApiOperation("用户加入群聊")
    @PostMapping(value = "/group/join-group", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> joinGroup(@RequestBody @Validated JoinOrQuitGroupReq req);

    @ApiOperation("用户退出群聊")
    @PostMapping(value = "/group/quit-group", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> quitGroup(@RequestBody @Validated JoinOrQuitGroupReq req);

    @ApiOperation("搜索群聊 根据id搜索")
    @PostMapping(value = "/group/search-group", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<GroupInfoVo> searchGroup(@RequestBody @Validated SearchGroupReq req);

    @ApiOperation("获取群成员 根据群id")
    @PostMapping(value = "/group/get-group-member", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<GroupMemberVo> getGroupMember(@RequestBody @Validated GetGroupMemberReq req);

    @ApiOperation("获取群基本信息，人数，群主，最大群人数，群名")
    @PostMapping(value = "/group/get-group-info", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<GroupInfoVo> getGroupInfo(@RequestBody @Validated GetGroupMemberReq req);

    @ApiOperation("修改群信息，能够群名")
    @PostMapping(value = "/group/update-group-name", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> updateGroupInfo(@RequestBody @Validated UpdateGroupNameReq req);

}
