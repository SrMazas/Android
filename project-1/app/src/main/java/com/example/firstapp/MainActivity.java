package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG,"Test");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Test");
    }

    @Override
                                                                 protected void onResume() {
        super.onResume();
        Log.i(TAG,"Test");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"Test");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Test");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w(TAG,"Test");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}