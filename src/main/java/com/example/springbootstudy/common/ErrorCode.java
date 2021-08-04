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
public enum ErrorCode {
    OPERATION_SUCCESS(000, "操作成功"),
    DUPLICATE_ERROR(001, "信息重复"),
    OPERATION_ERROR(400, "操作失败"),
    PASSWORD_ERROR(100, "密码错误"),
    AUTH_ERROR(101, "用户信息错误");

    private final int code;
    private final String msg;
}
