package com.example.springbootstudy.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Request<T> {
    @ApiModelProperty("业务请求(Get请求忽略)")

    private T body;

    public Request(T body) {
        this.body = body;
    }

    public Request() {
    }

}
