package com.example.springbootstudy.controller.vo;

import lombok.Data;

import java.util.List;

/**
 * @author zjianfa
 */
@Data
public class GroupMemberVo {

    private Long groupId;
    private List<UserInfoVo> userInfoVoList;

}
