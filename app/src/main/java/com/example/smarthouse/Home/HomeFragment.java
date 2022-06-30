package com.example.smarthouse.Home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.example.smarthouse.AddRoomActivity;
import com.example.smarthouse.ListAdapter;
import com.example.smarthouse.R;
import com.example.smarthouse.Room;
import com.example.smarthouse.UserProfile1.UserProfileFragment;
import com.example.smarthouse.UserRoomActiviry;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel mViewModel;

    GridView gridView;
    LinearLayout linearLayout;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.home_fragment, container, false);
        gridView = (GridView) view.findViewById(R.id.gridview);

        int[] icon = {R.drawable.ic_kitchen, R.drawable.ic_livingroom, R.drawable.ic_office};
        String[] roomname = {"Kitchen", "LivingRoom", "Office"};
        ArrayList<Room> roomArrayList = new ArrayList<>();

        for (int i = 0; i < icon.length; i++) {
            Room room = new Room(roomname[i], icon[i]);
            roomArrayList.add(room);
        }

        ListAdapter listAdapter = new ListAdapter(getActivity(), roomArrayList);
        gridView.setAdapter(listAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getActivity(), UserRoomActiviry.class);
                intent.putExtra("icon", icon[position]);
                intent.putExtra("roomname", roomname[position]);
                startActivity(intent);
            }
        });

        FloatingActionButton floatingActionButton = (FloatingActionButton) view.findViewById(R.id.add_room_btn);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddRoomActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }


}

