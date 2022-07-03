package com.company;

import com.company.House.House;
import com.company.LivingRoom.*;

public class Main {

    public static void main(String[] args) {
        Couch couch = new Couch("LazyBoy","L-Shape",5);
        Ottoman ottoman = new Ottoman("Large","Grey");
        Rug rug = new Rug("Black/White",12,10);
        TV  tv = new TV("Samsung",75);
        LivingRoom livingRoom = new LivingRoom("R&B Living Room",
                850,5, couch, ottoman, rug, tv, true);
        House house = new House("123 Main St",livingRoom);

        // Calling getter methods from livingRoom object.
        System.out.println(livingRoom.getTvBrand());
        System.out.println(livingRoom.getOttoman().getColor());
        System.out.println(livingRoom.getRug().getColor());

        // Calling methods from house object.
        System.out.println(house.getLivingRoomTvSize());
        System.out.println(house.getLivingRoom().hasFireplace());

        // Calling methods from inherited classes.
        System.out.println("The houses living room has " + house.getLivingRoom().getSqft() + " SqFt");
        System.out.println("The houses address is: " + house.getAddress());

    }
}
