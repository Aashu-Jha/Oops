package com.company;

public class Hamburger {
    private String Name;
    private String Roll_Type;
    private String Meat;
    private double Price;

    private String Addition1_Name;
    private double Addition1_Price;

    private String Addition2_Name;
    private double Addition2_Price;

    private String Addition3_Name;
    private double Addition3_Price;

    private String Addition4_Name;
    private double Addition4_Price;

    public Hamburger(String name, String roll_Type, String meat, double price) {
        this.Name = name;
        Roll_Type = roll_Type;
        Meat = meat;
        this.Price = price;
    }

    public void setName(String name) {
        Name = "Ham Burger";
    }

    public void Addition1(String Name, double Price){
        this.Addition1_Name = Name;
        this.Addition1_Price = Price;
    }

    public void Addition2(String Name, double Price){
        this.Addition2_Name = Name;
        this.Addition2_Price = Price;
    }

    public void Addition3(String Name, double Price){
        this.Addition3_Name = Name;
        this.Addition3_Price = Price;
    }

    public void Addition4(String Name, double Price){
        this.Addition4_Name = Name;
        this.Addition4_Price = Price;
    }

    public String getRoll_Type() {
        return Roll_Type;
    }

    public String getMeat() {
        return Meat;
    }

    public double getPrice() {
        return Price;
    }

    public double Final_Price(){
        double Hamburger = this.Price;
        System.out.println(this.Name +" with " + this.Meat + " meat " + " and " + this.Roll_Type + " bread priced " + this.Price);
        if(Addition1_Name != null){
            Hamburger += this.Addition1_Price;
            System.out.println("You added" + this.Addition1_Name + " costs " + this.Addition1_Price);
        }
        if(Addition2_Name != null){
            Hamburger += this.Addition2_Price;
            System.out.println("You added" + this.Addition2_Name + " costs " + this.Addition2_Price);
        }
        if(Addition3_Name != null){
            Hamburger += this.Addition3_Price;
            System.out.println("You added" + this.Addition3_Name + " costs " + this.Addition3_Price);
        }
        if(Addition4_Name != null){
            Hamburger += this.Addition4_Price;
            System.out.println("You added" + this.Addition4_Name + " costs " + this.Addition4_Price);
        }
        System.out.println("Total Pricing "+ Hamburger);
        return Hamburger;
    }
}
