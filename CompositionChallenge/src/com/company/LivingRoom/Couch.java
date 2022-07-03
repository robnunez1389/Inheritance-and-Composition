package com.company.LivingRoom;

public class Couch {

    public String brand;
    public String type;
    public int seats;

    public Couch(String brand, String type, int seats) {
        this.brand = brand;
        this.type = type;
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }
}
