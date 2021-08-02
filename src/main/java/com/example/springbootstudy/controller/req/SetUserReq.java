package com.example.springbootstudy.controller.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class SetUserReq {
    @ApiModelProperty("nickname")
    private String nickname;

    @ApiModelProperty("email")
    private String email;
}
