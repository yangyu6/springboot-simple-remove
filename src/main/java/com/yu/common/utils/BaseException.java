package com.yu.common.utils;

import lombok.Data;

/**
 * 自定义基础异常类
 *
 * @author:yu
 * @date:2019-04-23
 */
@Data
public class BaseException extends RuntimeException {
    int code;
    String msg;

    public BaseException(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }
    //throw new BaseException(500,"出错了");
}
