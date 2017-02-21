package com.linkorz.quickapp;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/**
 * Created by selin on 2017/2/21.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(getLayoutResId());

        ViewGroup contentFrameLayout = (ViewGroup)findViewById(Window.ID_ANDROID_CONTENT);

        View parentView = contentFrameLayout.getChildAt(0);
        if(parentView != null && Build.VERSION.SDK_INT >= 14){
            parentView.setFitsSystemWindows(true);
        }
    }

    abstract protected int getLayoutResId();
}
