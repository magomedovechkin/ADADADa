package com.example.smarthouseos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MainListAdapter extends ArrayAdapter<Room> {

    public MainListAdapter(@NonNull Context context, ArrayList<Room> roomArrayList) {
        super(context, R.layout.list_item_os, roomArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            Room room = getItem(position);

            if(convertView == null){

                convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_os, parent, false);

            }

            ImageView imageView = convertView.findViewById(R.id.imageview);
            TextView textView = convertView.findViewById(R.id.roomname);
            imageView.setImageResource(room.icon);
            textView.setText(room.roomname);
            return convertView;

    }
}
