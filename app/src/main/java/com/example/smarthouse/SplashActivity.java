package com.example.smarthouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView home_img;
    private Animation anim1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        home_img = findViewById(R.id.spin_house);

        anim1 = AnimationUtils.loadAnimation(this, R.anim.animation);
        home_img.startAnimation(anim1);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, NewResidentActivity.class);
                startActivity(intent);
                finish();      
            }
        }, 2500);
    }
}