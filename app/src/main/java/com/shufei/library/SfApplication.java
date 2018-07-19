package com.shufei.library;

import android.app.Application;

public class SfApplication extends Application {

    private static SfApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static SfApplication getInstance() {
        return instance;
    }
}
