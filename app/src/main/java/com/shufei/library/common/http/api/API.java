package com.shufei.library.common.http.api;

public class API {

    // 注册
    public static final String REGISTER = "/act/login/register/";
    // 登录
    public static final String LOGIN = "/act/login/login/";

    /***
     *  配置域名信息
     */
    public static class Config{

        private static final String TEST_DOMAIN = "http://api.sowe.com";
        private static final String RElEASE_DOMAIN = "http://api.sowe.com";
        private static String domain = TEST_DOMAIN;

        public static void setDebug(boolean isDebug){
            domain = isDebug ? TEST_DOMAIN : RElEASE_DOMAIN;
        }

        public static String getDomain() {
            return domain;
        }

        public static void setDomain(String domain) {
            Config.domain = domain;
        }
    }

}
