package com.hua.muti;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 *
 * @author hua
 * @date 2018/1/22
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(this);
    }
}
