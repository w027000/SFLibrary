package com.shufei.library.common.http;

public interface IResponse {

    /**
     * 获取状态码
     * @return  状态码
     */
    int getCode();

    /**
     * 获取数据体
     * @return  数据
     */
    String getData();


}
