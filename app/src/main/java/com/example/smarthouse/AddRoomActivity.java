package com.example.smarthouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Toolbar;


public class AddRoomActivity extends AppCompatActivity {

    androidx.appcompat.widget.Toolbar toolbar;
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);
        // Hide the status bar.
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);


        toolbar = findViewById(R.id.add_room_toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    public void save_click(View view) {
        edittext = findViewById(R.id.enter_room_edit);
        String roomName = edittext.getText().toString();

        Intent intent  = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void kitchen_click(View view) {

    }
}