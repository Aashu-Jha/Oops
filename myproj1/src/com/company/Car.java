package com.company;

public class Car extends Vehicle{
    private String Airbags;
    private String Steerings;
    private String Brake;

    public Car(String brand, String colour, int gears,String airbags, String steerings,String brake) {
        super(brand, "Car", colour, 4, gears);
        this.Airbags = airbags;
        this.Steerings= steerings;
        this.Brake= brake;
    }


    public void hand_steering(String Direction){
        System.out.println("Steering is in "+Direction+" direction");
    }

    public void Changing_gear(int gear){
        if(gear > 6)
            System.out.println("Cannot do it");
        else
            System.out.println("Gaer is in"+gear);
    }

    @Override
    public void Vehicle_Speed(double Speed) {
        super.Vehicle_Speed(Speed);
    }

    public String getAirbags() {
        return Airbags;
    }

    public String getSteerings() {
        return Steerings;
    }

    public String getBrake() {
        return Brake;
    }
}
