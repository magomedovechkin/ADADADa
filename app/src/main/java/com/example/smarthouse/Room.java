package com.example.smarthouse;

import java.util.ArrayList;

public class Room {
    String roomname;
    int icon;

    public Room(String roomname,  int icon) {
        this.roomname = roomname;
        this.icon = icon;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
