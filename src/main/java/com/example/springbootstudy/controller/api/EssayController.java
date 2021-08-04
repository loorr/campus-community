package com.example.springbootstudy.controller.api;

import com.example.springbootstudy.common.Response;
import com.example.springbootstudy.controller.EssayApi;
import com.example.springbootstudy.controller.req.StarUserReq;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EssayController implements EssayApi {

    @Override
    public Response<Boolean> addEssay(StarUserReq req) {
        return null;
    }

    @Override
    public Response<Boolean> deleteEssay(StarUserReq req) {
        return null;
    }

    @Override
    public Response<Boolean> updataEssayState(StarUserReq req) {
        return null;
    }

    @Override
    public Response<Boolean> getAllEssay(StarUserReq req) {
        return null;
    }
}
