package com.example.springbootstudy.controller.api;

import com.example.springbootstudy.common.Response;
import com.example.springbootstudy.controller.FriendApi;
import com.example.springbootstudy.controller.req.StarUserReq;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjianfa
 */
@RestController
public class FriendController implements FriendApi {

    @Override
    public Response<Boolean> starUser(StarUserReq req) {
        return null;
    }

}
