package com.example.springbootstudy.controller.api;

import com.example.springbootstudy.common.Response;
import com.example.springbootstudy.controller.FriendApi;
import com.example.springbootstudy.controller.req.GetAllFriendReq;
import com.example.springbootstudy.controller.req.StarUserReq;
import com.example.springbootstudy.controller.vo.FriendShipVo;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjianfa
 */
@RestController
public class FriendController implements FriendApi {


    @Override
    public Response<Boolean> addFriend(StarUserReq req) {
        return null;
    }

    @Override
    public Response<Boolean> deleteFriend(StarUserReq req) {
        return null;
    }

    @Override
    public Response<FriendShipVo> getAllFriend(GetAllFriendReq req) {
        return null;
    }
}
