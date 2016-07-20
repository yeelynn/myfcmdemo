package com.yl.demo.fcm.base;

import android.app.Application;

import com.splunk.mint.Mint;
import com.yl.demo.fcm.app.AppBuild;

/**
 * Created by Yee Lynn on 7/10/2016
 */
public class MyApplication extends Application {
    private static final String TAG = AppBuild.PROJ_TAG + "/MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        // Function Initiate SplunkMINT
        Mint.initAndStartSession(this, "ceac4cae");
    }
}
