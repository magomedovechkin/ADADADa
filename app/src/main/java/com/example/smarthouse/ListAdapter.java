package com.example.smarthouse;

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

public class ListAdapter extends ArrayAdapter<Room> {

    public ListAdapter(@NonNull Context context, ArrayList<Room> roomArrayList) {
        super(context, R.layout.room_list_item, roomArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Room room = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.room_list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.room_image);
        TextView textView = convertView.findViewById(R.id.room_name);
        textView.setText(room.roomname);
        imageView.setImageResource(room.icon);
        return convertView;
    }
}
