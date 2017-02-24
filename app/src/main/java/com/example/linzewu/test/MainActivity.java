package com.example.linzewu.test;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by linzewu on 17-2-24.
 */

public class MainActivity extends Activity implements TestController.TestListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TestController.getsInstance().setListener(new HelpReleaseListener(this));
        TestController.getsInstance().run();
    }

    @Override
    public void onTest() {
        
    }
}
