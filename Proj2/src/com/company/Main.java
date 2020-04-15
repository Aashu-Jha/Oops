package com.company;

public class Main {

    public static void main(String[] args) {
        Electronics electronics = new Electronics("Sony","Lenovo","Sony");
        Furniture furniture = new Furniture("Wheel Chair",new Dimesions(4,2,2));

        SingleRoom singleRoom = new SingleRoom(furniture,electronics);
        singleRoom.enterroom();
    }
}
