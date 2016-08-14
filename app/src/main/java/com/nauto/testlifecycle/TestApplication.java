package com.nauto.testlifecycle;

import android.app.Application;
import android.util.Log;

/**
 * Created by grahampoor on 8/13/16.
 */
public class TestApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("TestApplication"," onCreate() ");
    }
}
