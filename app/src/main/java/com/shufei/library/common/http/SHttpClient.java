package com.shufei.library.common.http;

import com.shufei.library.common.http.model.HttpHeaders;
import com.shufei.library.common.http.model.HttpParams;

/**
 * 网络请求的入口类
 */
public class SHttpClient {

    private HttpParams mCommonParams;       //全局公共请求参数
    private HttpHeaders mCommonHeaders;     //全局公共请求头

    /**这里配置一些公共全局参数，根据公司的接口需求去定义*/
    static {
    }


}
