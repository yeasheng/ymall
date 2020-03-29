package com.yeasheng.ymall.common.base;

/**
 * @author yeasheng
 * @since 2020/3/29
 */
public class CommonResult<T> {

    private long code;
    private long message;
    private T data;


    protected CommonResult() {

    }

}
