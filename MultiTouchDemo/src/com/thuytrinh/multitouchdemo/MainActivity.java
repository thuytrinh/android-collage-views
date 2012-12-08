package com.thuytrinh.multitouchdemo;

import com.thuytrinh.multitouchlistener.MultiTouchListener;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.imageview_background).setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                return true;
            }
        });

        findViewById(R.id.touchview_1).setOnTouchListener(new MultiTouchListener());
        findViewById(R.id.touchview_2).setOnTouchListener(new MultiTouchListener());
        findViewById(R.id.touchview_3).setOnTouchListener(new MultiTouchListener());
        findViewById(R.id.touchview_4).setOnTouchListener(new MultiTouchListener());
    }
}
