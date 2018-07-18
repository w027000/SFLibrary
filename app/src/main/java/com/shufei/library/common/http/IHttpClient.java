package com.shufei.library.common.http;


/**
 * HttpClient 抽象接口
 */
public interface IHttpClient {

    /**
     * GET
     * @param request
     * @param forceCache  是否强制使用缓存
     * @return
     */
    IResponse get(IRequest request,boolean forceCache);

    /**
     * POST 请求
     * @param request
     * @param forceCache  是否强制使用缓存
     * @return
     */
    IResponse post(IRequest request,boolean forceCache);

}
