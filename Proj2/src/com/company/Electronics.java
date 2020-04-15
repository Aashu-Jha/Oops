package com.company;

public class Electronics {
    private String television;
    private  String Laptop;
    private String Speakers;

    public Electronics(String television, String laptop, String speakers) {
        this.television = television;
        Laptop = laptop;
        Speakers = speakers;
    }

    public void watchtv(String On_or_Off){
        if(On_or_Off == "On")
            System.out.println("Television On");
        else
            System.out.println("television is off");
    }
    public void workonLaptop(String On_or_Off){
        if(On_or_Off == "On")
            System.out.println("Laptop On");
        else
            System.out.println("Laptop is off");
    }


    public String getTelevision() {
        return television;
    }

    public String getLaptop() {
        return Laptop;
    }

    public String getSpeakers() {
        return Speakers;
    }
}
