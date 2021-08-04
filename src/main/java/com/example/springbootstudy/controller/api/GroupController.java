package com.example.springbootstudy.controller.api;

import com.example.springbootstudy.common.Response;
import com.example.springbootstudy.controller.GroupApi;
import com.example.springbootstudy.controller.req.GetGroupMemberReq;
import com.example.springbootstudy.controller.req.JoinOrQuitGroupReq;
import com.example.springbootstudy.controller.req.SearchGroupReq;
import com.example.springbootstudy.controller.req.UpdateGroupNameReq;
import com.example.springbootstudy.controller.vo.GroupInfoVo;
import com.example.springbootstudy.controller.vo.GroupMemberVo;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjianfa
 */
@RestController
public class GroupController implements GroupApi {

    @Override
    public Response<Boolean> addGroup(JoinOrQuitGroupReq req) {
        return null;
    }

    @Override
    public Response<Boolean> joinGroup(JoinOrQuitGroupReq req) {
        return null;
    }

    @Override
    public Response<Boolean> quitGroup(JoinOrQuitGroupReq req) {
        return null;
    }

    @Override
    public Response<GroupInfoVo> searchGroup(SearchGroupReq req) {
        return null;
    }

    @Override
    public Response<GroupMemberVo> getGroupMember(GetGroupMemberReq req) {
        return null;
    }

    @Override
    public Response<GroupInfoVo> getGroupInfo(GetGroupMemberReq req) {
        return null;
    }

    @Override
    public Response<Boolean> updateGroupInfo(UpdateGroupNameReq req) {
        return null;
    }
}
