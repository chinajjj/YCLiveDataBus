package com.ycbjie.yclivedatabus.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ycbjie.yclivedatabus.R;
import com.yccx.livebuslib.utils.BusLogUtils;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BusLogUtils.d("------AppCompatActivity onCreate() called");
        testLifecycle();
    }

    @Override
    protected void onStop() {
        super.onStop();
        BusLogUtils.d("------AppCompatActivity onStop() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        BusLogUtils.d("------AppCompatActivity onResume() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        BusLogUtils.d("------AppCompatActivity onDestroy() called");
    }

    private void testLifecycle() {
        getLifecycle().addObserver(new LifecycleObserver() {

            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            void onCreate(){
                BusLogUtils.d("------LifecycleObserver onCreate() called");
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            void onResume(){
                BusLogUtils.d("------LifecycleObserver onResume() called");
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            void onStop(){
                BusLogUtils.d("------LifecycleObserver onStop() called");
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            void onDestroy(){
                BusLogUtils.d("------LifecycleObserver onDestroy() called");
            }
        });
    }

}
