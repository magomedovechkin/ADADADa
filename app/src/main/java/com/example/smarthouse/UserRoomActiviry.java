package com.example.smarthouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.smarthouse.Light.LightFragment;
import com.example.smarthouse.Thermostat.ThermostatFragment;
import com.google.android.material.appbar.MaterialToolbar;

public class UserRoomActiviry extends AppCompatActivity {

    private MaterialToolbar toolbar;

    private LinearLayout light;
    private LinearLayout thermostat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_room);

        toolbar = findViewById(R.id.user_toolbar);
        light = findViewById(R.id.light_ll);
        thermostat = findViewById(R.id.thermostat_ll);

        Intent intent = getIntent();
        if (intent != null){
            int icon = intent.getIntExtra("icon", 0);
            String roomname = intent.getStringExtra("roomname");
            toolbar.setTitle(roomname);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void light_click(View view) {
        LightFragment lightFragment = new LightFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.user_room_body, lightFragment).commit();
    }

    public void thermostat_click(View view) {
        ThermostatFragment thermostatFragment = new ThermostatFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.user_room_body, thermostatFragment).commit();
    }
}