package com.company;

public class Vehicle {

    private String Brand;
    private String Type;
    private String Colour;
    private int Tyres;
    private int Gears;

    public Vehicle(String brand, String type, String colour, int tyres, int gears) {
        this.Brand = brand;
        this.Type = type;
        this.Colour = colour;
        this.Tyres = tyres;
        this.Gears = gears;
    }

    public void stop(){
        this.Gears =1;
        System.out.println("Stopped");
    }
    public void Vehicle_Speed(double Speed){
        if(Speed == 0)
            stop();
        else
            System.out.println("car is in speed of"+Speed);
    }
    public String getBrand() {
        return Brand;
    }

    public String getType() {
        return Type;
    }

    public String getColour() {
        return Colour;
    }

    public int getTyres() {
        return Tyres;
    }

    public int getGears() {
        return Gears;
    }
}
