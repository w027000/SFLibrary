package com.shufei.library.common.http.request.base;

import android.text.TextUtils;

import com.shufei.library.common.http.model.HttpHeaders;
import com.shufei.library.common.http.model.HttpParams;

import okhttp3.Call;
import okhttp3.Request;

/**
 * 所有请求的基类，其中泛型 R 主要用于属性设置方法后，返回对应的子类型，以便于实现链式调用
 * @param <R>
 */
public abstract class BaseRequest <R extends BaseRequest> {

    protected int retryCount;                           //默认超时重连次数
    protected long cacheTime;                           //默认缓存的超时时间
    protected HttpParams params = new HttpParams();     //添加的param
    protected HttpHeaders headers = new HttpHeaders();  //添加的header

    protected transient Request mRequest;
    protected transient Call call;

    /***
     * 这里设置一些公共参数
     */
    public BaseRequest(){
        //默认添加 Accept-Language
        String acceptLanguage = HttpHeaders.getAcceptLanguage();
        if (!TextUtils.isEmpty(acceptLanguage)) {
            headers.put(HttpHeaders.HEAD_KEY_ACCEPT_LANGUAGE, acceptLanguage);
        }
        //默认添加 User-Agent
        String userAgent = HttpHeaders.getUserAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            headers.put(HttpHeaders.HEAD_KEY_USER_AGENT, userAgent);
        }
        //添加公共请求参数
    }




}
