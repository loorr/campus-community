package com.example.springbootstudy.controller.req;

import com.example.springbootstudy.controller.common.FriendState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author zjianfa
 */
@Data
@ApiModel
public class GetAllFriendReq {

    @ApiModelProperty(value = "10位的用户id")
    @NotNull
    private Long uid;

    @ApiModelProperty(value = "标识好友范围，关注者，粉丝，好友")
    @NotNull
    private FriendState range;
}
