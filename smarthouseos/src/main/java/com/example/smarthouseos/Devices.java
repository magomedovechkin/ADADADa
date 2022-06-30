package com.example.smarthouseos;

public class Devices {
    int iconD;
    String devicesName;

    public Devices(int iconD, String devicesName) {
        this.iconD = iconD;
        this.devicesName = devicesName;
    }

    public int getIconD() {
        return iconD;
    }

    public void setIconD(int iconD) {
        this.iconD = iconD;
    }

    public String getDevicesName() {
        return devicesName;
    }

    public void setDevicesName(String devicesName) {
        this.devicesName = devicesName;
    }
}
