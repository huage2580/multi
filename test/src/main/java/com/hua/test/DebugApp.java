package com.hua.test;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by hua on 2018/1/22.
 */

public class DebugApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(this);
    }
}
