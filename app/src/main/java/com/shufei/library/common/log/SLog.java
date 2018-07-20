package com.shufei.library.common.log;

import android.util.Log;

/**
 * @author jianhua
 * 日志的工具类
 */
public class SLog {

    private static boolean isLogEnable = true;

    private static String tag = "SF";

    /**
     * 设置是否是debug模式
     * @param isEnable  true  打印日志   false  不打印日志
     */
    public static void setDebug(boolean isEnable) {
        debug(tag, isEnable);
    }

    /**
     * 设置是否是debug模式以及对应的TAG
     * @param logTag  tag  默认的tag 是  SF
     * @param isEnable true  打印日志   false  不打印日志
     */
    public static void debug(String logTag, boolean isEnable) {
        tag = logTag;
        isLogEnable = isEnable;
    }

    public static void v(String msg) {
        v(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (isLogEnable) Log.v(tag, msg);
    }

    public static void d(String msg) {
        d(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (isLogEnable) Log.d(tag, msg);
    }

    public static void i(String msg) {
        i(tag, msg);
    }

    public static void i(String tag, String msg) {
        if (isLogEnable) Log.i(tag, msg);
    }

    public static void w(String msg) {
        w(tag, msg);
    }

    public static void w(String tag, String msg) {
        if (isLogEnable) Log.w(tag, msg);
    }

    public static void e(String msg) {
        e(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (isLogEnable) Log.e(tag, msg);
    }

    public static void printStackTrace(Throwable t) {
        if (isLogEnable && t != null) t.printStackTrace();
    }



}
