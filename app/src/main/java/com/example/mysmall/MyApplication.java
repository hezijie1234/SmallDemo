package com.example.mysmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by Administrator on 2017-04-07.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Small.preSetUp(this);
    }
}
