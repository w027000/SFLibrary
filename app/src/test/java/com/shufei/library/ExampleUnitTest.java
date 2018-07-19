package com.shufei.library;

import com.shufei.library.common.http.model.HttpHeaders;
import com.shufei.library.common.http.model.HttpParams;
import com.shufei.library.common.http.utils.HttpUtils;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_http_params(){
        HttpParams httpParams = new HttpParams();
        httpParams.put("1","6",true,true,true);
        httpParams.put("2","6",true,true,true);
        httpParams.put("3","6",true,true,true);

        System.out.println("httpParams---->" + HttpHeaders.getAcceptLanguage());



    }
}