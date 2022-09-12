package com.qi.springcloud.entities;

import lombok.Data;

/**
 * @author 2021229100@tju.edu.cn
 * @date 2022/9/7 16:11 response通用返回对象
 */
@Data
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
