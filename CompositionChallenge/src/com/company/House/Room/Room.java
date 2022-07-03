package com.company.House.Room;

public class Room {
    private String name;
    private int sqft;
    private int windows;

    public Room(String name, int sqft, int windows) {
        this.name = name;
        this.sqft = sqft;
        this.windows = windows;
    }

    public String getName() {
        return name;
    }

    public int getSqft() {
        return sqft;
    }

    public int getWindows() {
        return windows;
    }
}
