package com.shufei.library.common.http;

import android.app.Application;
import android.content.Context;

import com.shufei.library.common.http.model.HttpHeaders;
import com.shufei.library.common.http.model.HttpParams;
import com.shufei.library.common.http.utils.HttpUtils;

import okhttp3.OkHttpClient;

/***
 * 2018年7月19日
 * 网络请求的入口类
 */
public class SFHttp {

    private Application context;            //全局上下文
    private OkHttpClient okHttpClient;      //ok请求的客户端
    private HttpParams mCommonParams;       //全局公共请求参数
    private HttpHeaders mCommonHeaders;     //全局公共请求头
    private int mRetryCount;                //全局超时重试次数



    /** 获取全局上下文 */
    public Context getContext() {
        HttpUtils.checkNotNull(context, "please call SFHttp.getInstance().init() first in application!");
        return context;
    }


    public static SFHttp getInstance() {
        return SFHttpHolder.holder;
    }

    private static class SFHttpHolder {
        private static SFHttp holder = new SFHttp();
    }

    /** get请求 */
    public static <T> GetRequest<T> get(String url) {
        return new GetRequest<>(url);
    }

    /** post请求 */
    public static <T> PostRequest<T> post(String url) {
        return new PostRequest<>(url);
    }

    /** 获取全局公共请求参数 */
    public HttpParams getCommonParams() {
        return mCommonParams;
    }

    /** 添加全局公共请求参数 */
    public SFHttp addCommonParams(HttpParams commonParams) {
        if (mCommonParams == null)
            mCommonParams = new HttpParams();
        mCommonParams.put(commonParams);
        return this;
    }

    /** 获取全局公共请求头 */
    public HttpHeaders getCommonHeaders() {
        return mCommonHeaders;
    }

    /** 添加全局公共请求参数 */
    public SFHttp addCommonHeaders(HttpHeaders commonHeaders) {
        if (mCommonHeaders == null)
                mCommonHeaders = new HttpHeaders();
        mCommonHeaders.put(commonHeaders);
        return this;
    }

}
