package com.company;

public class Deluxe_Burger extends Hamburger {

    public Deluxe_Burger(String roll_Type, String meat,double price) {
        super("Deluxe Burger", roll_Type, meat,price);
        super.Addition1("Chips",60.0);
        super.Addition2("Coke",60.0);
    }

    @Override
    public void Addition1(String Name, double Price) {
        System.out.println("Cannot add in combo");
    }

    @Override
    public void Addition2(String Name, double Price) {
        System.out.println("Cannot add in combo");
    }

    @Override
    public void Addition3(String Name, double Price) {
        System.out.println("Cannot add in combo");
    }

    @Override
    public void Addition4(String Name, double Price) {
        System.out.println("Cannot add in combo");
    }

}
