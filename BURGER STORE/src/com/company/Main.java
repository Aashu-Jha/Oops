package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Ham Burger","Thin","Chicken",50.0);
	    hamburger.Addition1("tomato",20);
	    hamburger.Addition2("Carrot",20);
	    hamburger.Final_Price();

	    Healthy_Burger healthy_burger = new Healthy_Burger("bacon",200);
	    healthy_burger.Addition1("Tomato",10);
	    healthy_burger.Addition2("Cheese",30);
	    healthy_burger.Final_Price();

	    Deluxe_Burger deluxe_burger = new Deluxe_Burger("Thin","Lamb",200.0);
	    deluxe_burger.Final_Price();
    }
}
