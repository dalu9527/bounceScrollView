package com.bounce;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.util.Log;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.io.File;

/**
 * @author xxoo
 * @date 5/12/2016.
 */
public class MyApplication extends Application {
    private static final String TAG="MyApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        initFresco();
    }
    /**
     * 初始化Fresco
     */
    private void initFresco() {
        Fresco.initialize(this);
    }

}
