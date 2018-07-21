package com.shufei.library.common.http;

import com.shufei.library.common.http.model.HttpHeaders;
import com.shufei.library.common.http.model.HttpParams;
import com.shufei.library.common.http.cache.CacheStrategy;

import okhttp3.OkHttpClient;

/**
 * 网络请求的入口类
 */
public class SHttpClient {

    /**默认的超时时间*/
    public static final long DEFAULT_MILLISECONDS = 60000;
    /**回调刷新时间（单位ms）*/
    public static long REFRESH_TIME = 300;

    /**全局超时重连次数*/
    private int mRetryCount;
    /**全局缓存模式*/
    private CacheStrategy mCacheStrategy;


    /**OKHTTP客户端*/
    private OkHttpClient okHttpClient;

    /**公共请求参数*/
    private HttpParams commonParams;
    /**公共请求头*/
    private HttpHeaders commonHeaders;

    /**这里配置一些公共全局参数，根据公司的接口需求去定义*/
    private SHttpClient(){
        mRetryCount = 3;



    }

    public static SHttpClient getInstance(){
        return new SHttpClient();
    }



}
