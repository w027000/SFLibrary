package com.shufei.library;

import com.shufei.library.common.http.model.HttpHeaders;
import com.shufei.library.common.http.model.UserAgent;

import org.junit.Test;

public class TestHttp {

    @Test
    public void testHttpHead(){

        HttpHeaders httpHeaders = new HttpHeaders();
        System.out.print("httpHeaders--->" + UserAgent.instance());

    }

}
