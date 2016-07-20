package com.yl.demo.fcm.app;

public class AppSession {

    private static final String TAG = AppBuild.PROJ_TAG + "/AppSession";

    /*
     * Called on: 1) MyPageNavi.goToLandingActivity(boolean newBundle)
     */
    public static void clearAll() {
        Sample.dispose();
    }

    /*
     * Called on: 1) MyPageNavi.goToMainActivity(boolean newBundle)
     */
    public static void clearInfo() {
    }

    public static class Sample {
        public static String username = "";
        public static String password = "";
        public static String datetime = "";

        public static void dispose() {
            username = null;
            password = null;
            datetime = null;
            System.gc();
        }
    }
}
