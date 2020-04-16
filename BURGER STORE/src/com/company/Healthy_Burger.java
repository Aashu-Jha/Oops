package com.company;

public class Healthy_Burger extends Hamburger{
    private String Addition5_Name;
    private double Addition5_Price;

    private String Addition6_Name;
    private double Addition6_Price;

    public Healthy_Burger(String meat, double price) {
        super("Healthy Burger", "Brown Eye Bread", meat, price);
    }

    @Override
    public void Addition1(String Name, double Price) {
        super.Addition1(Name, Price);
    }

    @Override
    public void Addition2(String Name, double Price) {
        super.Addition2(Name, Price);
    }

    @Override
    public void Addition3(String Name, double Price) {
        super.Addition3(Name, Price);
    }

    @Override
    public void Addition4(String Name, double Price) {
        super.Addition4(Name, Price);
    }

    public void Addition5(String Name, double Price) {
        this.Addition5_Name = Name;
        this.Addition5_Price = Price;
    }

    public void Addition6(String Name, double Price) {
        this.Addition6_Name = Name;
        this.Addition6_Price = Price;
    }

    @Override
    public double Final_Price() {
        double Hamburger = super.Final_Price();
        if(Addition5_Name != null){
            Hamburger += this.Addition5_Price;
            System.out.println("You added" + this.Addition5_Name + " costs " + this.Addition5_Price);
        }
        if(Addition6_Name != null){
            Hamburger += this.Addition6_Price;
            System.out.println("You added" + this.Addition6_Name + " costs " + this.Addition6_Price);
        }
        return Hamburger;
    }
}
