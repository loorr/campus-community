package com.example.springbootstudy.common;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel
public class Response<T> {

    @ApiModelProperty(value = "返回码", example = "200")
    private Integer code;

    @ApiModelProperty(value = "返回码描述", example = "ok")
    private String message;

    @ApiModelProperty(value = "响应时间戳", example = "2020-08-12 14:37:11")
    private Date timestamp = new Date();

    @ApiModelProperty(value = "返回结果")
    private T data;


    public static <T> Response<T> getOkResponse(T data){
        Response<T> response = new Response<>();
        response.setCode(200);
        response.setMessage("成功");
        response.setData(data);
        return response;
    }

    public static <T> Response<T> getFailResponse(){
        Response<T> response = new Response<>();
        return response;
    }
}
