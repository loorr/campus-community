package com.example.springbootstudy.controller.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author zjianfa
 */
@Data
@ApiModel
public class StarUserReq {

    @ApiModelProperty("uid")
    @NotNull
    private Long uid;

    @ApiModelProperty("starUid")
    @NotNull
    private Long starUid;
}
