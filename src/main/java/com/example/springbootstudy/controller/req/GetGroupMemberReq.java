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
public class GetGroupMemberReq {
    @ApiModelProperty(value = "10位的用户id")
    @NotNull
    private Long uid;

    @ApiModelProperty(value = "10位的group id")
    @NotNull
    private Long groupId;
}
