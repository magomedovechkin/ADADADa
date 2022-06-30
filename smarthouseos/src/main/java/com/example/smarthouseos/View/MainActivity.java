package com.example.smarthouseos.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.smarthouseos.MainListAdapter;
import com.example.smarthouseos.R;
import com.example.smarthouseos.Room;
import com.example.smarthouseos.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ActivityMainBinding binding;

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        gridView = findViewById(R.id.gridview);

        String[] roomname ={"Kitchen", "LivingRoom", "Office"};
        int[] icon = {R.drawable.ic_room_name_kitchen__selected_on, R.drawable.ic_room_name_bedroom__selected_on, R.drawable.ic_room_name_office__selected_on};
        ArrayList<Room> roomArrayList = new ArrayList<>();

        for(int i = 0; i< icon.length; i++){
            Room room = new Room(roomname[i], icon[i]);
            roomArrayList.add(room);
        }

        MainListAdapter listAdapter = new MainListAdapter(this, roomArrayList);
        gridView.setAdapter(listAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DevicesActivity.class);
                intent.putExtra("roomname", roomname[position]);
                intent.putExtra("icon", icon[position]);
                startActivity(intent);
            }
        });
    }
}