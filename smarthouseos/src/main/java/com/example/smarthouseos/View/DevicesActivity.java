package com.example.smarthouseos.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.smarthouseos.Devices;
import com.example.smarthouseos.DevicesListAdapter;
import com.example.smarthouseos.R;

import java.util.ArrayList;

public class DevicesActivity extends Activity {

    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devices);

        gridView = findViewById(R.id.gridview_devices);

        int[] devicesicon = {R.drawable.ic_group};
        String[] devicestext = {"Light"};

        ArrayList<Devices> arrayList = new ArrayList<>();

        for (int i = 0; i < devicesicon.length; i++){
            Devices devices = new Devices(devicesicon[i], devicestext[i]);
            arrayList.add(devices);
        }

        DevicesListAdapter devicesListAdapter = new DevicesListAdapter(this, arrayList);
        gridView.setAdapter(devicesListAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DevicesActivity.this, LightActivity.class);
                startActivity(intent);
            }
        });
    }
}