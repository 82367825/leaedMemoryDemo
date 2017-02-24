package com.example.linzewu.test;

import java.lang.ref.WeakReference;

/**
 * Created by linzewu on 17-2-24.
 */

public class TestController {
    
    private static TestController sInstance = null;
    public static synchronized TestController getsInstance() {
        if (sInstance == null) {
            sInstance = new TestController();
        }
        return sInstance;
    }
    
    public void run() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000 * 20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    
    public void setListener(TestListener listener) {
        this.mTestListener = listener;
    }
    
    private TestListener mTestListener;
    
    public interface TestListener {
        void onTest();
    }
    
    
}
