package com.company.LivingRoom;

public class TV {
    private String brand;
    private int screenSize;

    public TV(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public int getScreenSize() {
        return screenSize;
    }
}
