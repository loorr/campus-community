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
@Api(value = "个人动态，包括匿名,实名 接口")
public interface EssayApi {

    @ApiOperation("发布动态, 包括匿名和实名")
    @PostMapping(value = "/essay/add-essay", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> addEssay(@RequestBody @Validated StarUserReq req);

    @ApiOperation("删除动态")
    @PostMapping(value = "/essay/delete-essay", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> deleteEssay(@RequestBody @Validated StarUserReq req);

    @ApiOperation("改变动态公开性")
    @PostMapping(value = "/essay/update-essay-state", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> updataEssayState(@RequestBody @Validated StarUserReq req);

    @ApiOperation("获取公开的动态")
    @PostMapping(value = "/essay/get-all-essay", produces = MediaType.APPLICATION_JSON_VALUE)
    Response<Boolean> getAllEssay(@RequestBody @Validated StarUserReq req);

}
