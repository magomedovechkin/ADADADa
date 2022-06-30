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

public class DevicesListAdapter extends ArrayAdapter<Devices> {


    public DevicesListAdapter(@NonNull Context context, ArrayList<Devices> devicesArrayList) {
        super(context, R.layout.list_item_devices, devicesArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        Devices devices = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_devices, parent, false);
        }

        ImageView imageDevices = convertView.findViewById(R.id.imageDevice);
        TextView textdevices = convertView.findViewById(R.id.textDevice);
        imageDevices.setImageResource(devices.iconD);
        textdevices.setText(devices.devicesName);
        return convertView;

    }
}
