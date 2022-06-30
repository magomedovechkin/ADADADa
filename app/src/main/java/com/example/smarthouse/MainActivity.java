package com.example.smarthouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.smarthouse.Home.HomeFragment;
import com.example.smarthouse.UserProfile1.UserProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottonnavigationview_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_body, new HomeFragment()).commit();
        bottomNavigationView.setSelectedItemId(R.id.app_bar_home);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.app_bar_home:
                        fragment = new HomeFragment();
                        break;

                    case  R.id.app_bar_statics:
                        fragment = new HomeFragment();
                        break;

                    case R.id.app_bar_routines:
                        fragment = new HomeFragment();
                        break;

                    case  R.id.app_bar_setting:
                        fragment = new UserProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.main_body, fragment).commit();
                return true;
            }
        });
    }
}