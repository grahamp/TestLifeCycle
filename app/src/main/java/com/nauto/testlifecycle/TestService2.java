package com.nauto.testlifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class TestService2 extends Service {
    private static final String TAG = TestService2.class.getSimpleName();
    private int startCount;

    public TestService2() {
        Log.d(TAG," TestService2 () ");

    }
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreateSevice2  ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroyService2 ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startCount++;
        Log.d(TAG, "onStartCommand intent" + intent + " flags " + flags + " startId " + startId);
        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
