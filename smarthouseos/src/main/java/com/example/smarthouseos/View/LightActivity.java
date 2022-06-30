package com.example.smarthouseos.View;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.smarthouseos.R;

public class LightActivity extends Activity {

    private TextView lightStrengthText;
    private ImageButton plus, minus, onOff;

    public int light = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);

        lightStrengthText = findViewById(R.id.light_strength);
    }

    public void minus_click(View view) {
        lightStrengthText.setText(""+light);
        light--;
    }

    public void plus_click(View view) {
        lightStrengthText.setText(""+light);
        light++;
    }
}