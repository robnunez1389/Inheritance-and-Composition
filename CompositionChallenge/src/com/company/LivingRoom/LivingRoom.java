package com.company.LivingRoom;

import com.company.House.Room.Room;

public class LivingRoom extends Room {
    private Couch couch;
    private Ottoman ottoman;
    private Rug rug;
    private TV tv;
    private boolean hasFireplace;

    public LivingRoom(String name,
                      int sqft,
                      int windows,
                      Couch couch,
                      Ottoman ottoman,
                      Rug rug,
                      TV tv,
                      boolean hasFireplace) {
        super(name, sqft, windows);
        this.couch = couch;
        this.ottoman = ottoman;
        this.rug = rug;
        this.tv = tv;
        this.hasFireplace = hasFireplace;
    }

    // Method in class to grab specific field from tv object.
    public String getTvBrand(){
        return tv.getBrand();
    }

    public Couch getCouch() {
        return couch;
    }

    public Ottoman getOttoman() {
        return ottoman;
    }

    public Rug getRug() {
        return rug;
    }

    public TV getTv() {
        return tv;
    }

    public boolean hasFireplace() {
        return hasFireplace;
    }
}
