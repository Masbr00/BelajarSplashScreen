package com.example.splashscreenact;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashYo extends AppCompatActivity {
    TextView SelamatDatang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_yo);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent((getApplicationContext()), MainActivity.class));
                finish();
            }
        }, 3000);
    }
}
