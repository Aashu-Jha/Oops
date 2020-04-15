package com.company;

public class SingleRoom {
    private Furniture furniture;
    private Electronics electronics;

    public SingleRoom(Furniture furniture, Electronics electronics) {
        this.furniture = furniture;
        this.electronics = electronics;
    }


    public void enterroom(){
        furniture.WantSit(true);
    }


}
