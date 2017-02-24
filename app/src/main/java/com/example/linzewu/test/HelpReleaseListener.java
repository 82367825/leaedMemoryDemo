package com.example.linzewu.test;

import java.lang.ref.WeakReference;

/**
 * Created by linzewu on 17-2-24.
 */

public class HelpReleaseListener implements TestController.TestListener {
    
    private WeakReference<TestController.TestListener> mTestListenerWeakReference;
    
    public HelpReleaseListener(TestController.TestListener testListener) {
        mTestListenerWeakReference = new WeakReference<TestController.TestListener>(testListener);
    }
    
    @Override
    public void onTest() {
        if (mTestListenerWeakReference.get() != null) {
            mTestListenerWeakReference.get().onTest();
        }
    }
}
