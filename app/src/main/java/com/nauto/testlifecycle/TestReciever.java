package com.nauto.testlifecycle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class TestReciever extends BroadcastReceiver {
    public TestReciever() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("TestReciever"," onReceive() "+intent.toString());

    }
}
