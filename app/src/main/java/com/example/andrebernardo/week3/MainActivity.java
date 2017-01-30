package com.example.andrebernardo.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   Log.i("ACTIVITY 1 TAG", "OnCreate method is invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ACTIVITY 1 TAG", "OnCreate method is invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ACTIVITY 1 TAG", "OnCreate method is invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ACTIVITY 1 TAG", "OnCreate method is invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ACTIVITY 1 TAG", "OnCreate method is invoked");
    }
}



