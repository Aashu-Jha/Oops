package com.company;

public class Fortuner extends Car{
    private String Oil_type;
    private String Windd_Shield;

    public Fortuner(String colour) {
        super("Fortuner", colour, 6, "8", "Power", "Power Disc");
    }

    @Override
    public void hand_steering(String Direction) {
        super.hand_steering(Direction);
    }

    @Override
    public void Changing_gear(int gear) {
        super.Changing_gear(gear);
    }

    @Override
    public void Vehicle_Speed(double Speed) {
        super.Vehicle_Speed(Speed);
    }

    public String getOil_type() {
        return Oil_type;
    }

    public String getWindd_Shield() {
        return Windd_Shield;
    }
}
