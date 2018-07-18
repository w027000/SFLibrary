package com.shufei.library.common.http.impl;


import com.alibaba.fastjson.JSON;
import com.shufei.library.BuildConfig;
import com.shufei.library.common.http.IRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * 封装参数的实现
 */
public class BaseRequest implements IRequest{

    private static final String key = "vFMdQhn6RCNQM1lzJ2ABT1yeEz0qlMF5MOiDl93cCB+Zxtw0zRL4bHJ92nIBtNs";

    private String method = POST;
    private String url;
    private Map<String, String> header;
    private Map<String, Object> body;

    public BaseRequest(String url){
        //这里设置公共参数
        this.url = url;
        header = new HashMap<>();
        body = new HashMap<>();
        body.put("platform","02");
        body.put("version", String.valueOf(BuildConfig.VERSION_NAME));
    }


    @Override
    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public void setHeader(String key, String value) {
        header.put(key, value);
    }

    @Override
    public void setBody(String key, String value) {
        body.put(key, value);
    }

    @Override
    public String getUrl() {
        if (GET.equals(method)) {
            StringBuffer sb = new StringBuffer(url);
            sb.append("&");
            for (String key : body.keySet()){
                sb.append(key);
                sb.append("=");
                sb.append(body.get(key).toString());
            }
            return sb.toString();
        }
        return url;
    }

    @Override
    public Map<String, String> getHeader() {
        return header;
    }

    @Override
    public Object getBody() {
        if (body != null){
            // 组装 POST 方法请求参数
            return JSON.toJSONString(body);
        } else {
            return "{}";
        }
    }
}
