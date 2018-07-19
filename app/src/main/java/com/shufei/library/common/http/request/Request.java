package com.shufei.library.common.http.request;

import android.text.TextUtils;

import com.shufei.library.common.http.SFHttp;
import com.shufei.library.common.http.model.HttpHeaders;
import com.shufei.library.common.http.model.HttpParams;

import java.io.Serializable;

/**
 * 所有请求的基类，其中泛型 R 主要用于属性设置方法后，返回对应的子类型，以便于实现链式调用
 */
public abstract class Request<T,R extends Request> implements Serializable{

    protected String url;
    protected HttpParams params = new HttpParams();     //添加的param
    protected HttpHeaders headers = new HttpHeaders();  //添加的header

    public Request(String url){
        this.url = url;
        //默认添加 Accept-Language
        String acceptLanguage = HttpHeaders.getAcceptLanguage();
        if (!TextUtils.isEmpty(acceptLanguage)){
            headers(HttpHeaders.HEAD_KEY_ACCEPT_LANGUAGE, acceptLanguage);
        }
        //默认添加 User-Agent
        String userAgent = HttpHeaders.getUserAgent();
        if (!TextUtils.isEmpty(userAgent)) {
            headers(HttpHeaders.HEAD_KEY_USER_AGENT, userAgent);
        }
        SFHttp sfHttp = SFHttp.getInstance();
        //添加公共请求参数
        if (sfHttp.getCommonParams() != null){
            params(sfHttp.getCommonParams());
        }
        if (sfHttp.getCommonHeaders() != null) {
            headers(sfHttp.getCommonHeaders());
        }


    }


    public R headers(String key, String value) {
        headers.put(key, value);
        return (R) this;
    }

    public R headers(HttpHeaders headers) {
        this.headers.put(headers);
        return (R) this;
    }

    public R params(HttpParams params) {
        this.params.put(params);
        return (R) this;
    }

}
