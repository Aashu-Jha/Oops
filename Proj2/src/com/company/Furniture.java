package com.company;

public class Furniture {
    private String Chair;
    private Dimesions dimesions;

    public Furniture(String chair, Dimesions dimesions) {
        Chair = chair;
        this.dimesions = dimesions;
    }

    public void WantSit(boolean tre_or_False){
        if(tre_or_False == true)
            System.out.println("Sit on table");
        else
            System.out.println("Want to stand");
    }
    public Dimesions getDimesions() {
        return dimesions;
    }


    public String getChair() {
        return Chair;
    }
}
