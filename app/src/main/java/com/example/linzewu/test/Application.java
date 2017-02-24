package com.example.linzewu.test;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by linzewu on 17-2-24.
 */

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //内存泄漏检测
        if (BuildConfig.DEBUG) {
            if (LeakCanary.isInAnalyzerProcess(this)) {
                return;
            }
            LeakCanary.install(this);
        }
    }
}
