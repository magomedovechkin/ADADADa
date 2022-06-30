package com.example.smarthouseos.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.smarthouseos.R;

public class SplashActivity extends Activity {

    ImageView imageView;
    private Animation anim1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        imageView = findViewById(R.id.splash_home);
        anim1 = AnimationUtils.loadAnimation(this, R.anim.splash_anim);

        imageView.startAnimation(anim1);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },2500);
    }
}