package com.company.House;

import com.company.Building.Building;
import com.company.LivingRoom.LivingRoom;

public class House extends Building {
    private LivingRoom livingRoom;

    public House(String address, LivingRoom livingRoom) {
        super(address);
        this.livingRoom = livingRoom;
    }
//    private Bedroom bedroom;
//    private Bathroom bathroom;
//    private Garage garage;

//    public House(LivingRoom livingRoom) {
//        super();
//        this.livingRoom = livingRoom;
//    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public int getLivingRoomTvSize(){
        return livingRoom.getTv().getScreenSize();
    }
}
