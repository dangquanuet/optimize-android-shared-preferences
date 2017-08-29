package com.framgia.optimizesharedprefs;

import android.app.Application;
import com.google.gson.Gson;

/**
 * Created by FRAMGIA\dang.anh.quan on 29/08/2017.
 */

public class App extends Application {

    private static App mSelf;
    private Gson mGSon;

    public static App self() {
        return mSelf;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mSelf = this;
        mGSon = new Gson();
    }

    public Gson getGSon() {
        return mGSon;
    }
}
