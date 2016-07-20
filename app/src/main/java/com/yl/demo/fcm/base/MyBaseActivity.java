package com.yl.demo.fcm.base;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Yee Lynn on 7/18/2016
 */
public abstract class MyBaseActivity extends AppCompatActivity {

    private static long lastClickTime;

    public static boolean isFastDoubleClick() {
        long time = System.currentTimeMillis();
        if (Math.abs(time - lastClickTime) < 1000) {
            return true;
        }
        lastClickTime = time;
        return false;
    }
}
