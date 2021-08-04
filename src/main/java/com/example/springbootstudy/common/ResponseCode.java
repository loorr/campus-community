package com.example.springbootstudy.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author zjianfa
 */

@Getter
@ToString
@AllArgsConstructor
public enum ResponseCode {
    OPERATION_SUCCESS(200, "操作成功"),
    OPERATION_ERROR(400, "操作失败"),
    PASSWORD_ERROR(100, "密码错误");

    private final int code;
    private final String msg;
}
