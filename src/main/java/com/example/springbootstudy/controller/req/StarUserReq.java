package com.example.springbootstudy.controller.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zjianfa
 */
@Data
@ApiModel
public class StarUserReq {

    @ApiModelProperty("uid")
    private Long uid;

    @ApiModelProperty("starUid")
    private Long starUid;
}