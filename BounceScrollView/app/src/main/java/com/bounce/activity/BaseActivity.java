package com.bounce.activity;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bounce.util.ViewUtil;

/**
 * @author xxoo
 * @date 5/12/2016.
 */
public class BaseActivity extends AppCompatActivity{
    public <E extends View> E $(int resId) {
        return ViewUtil.findViewById(this, resId);
    }
}
