package com.company;

class car{
    private boolean Engine;
    private String Cylinders;
    private int Wheels;
    private String Name;

    public car(String cylinders,String name) {
        Engine = true;
        Cylinders = cylinders;
        Wheels = 4;
        Name = name;
    }

    public String getCylinders() {
        return Cylinders;
    }

    public String getName() {
        return Name;
    }

    public String StartEngine(){
        return "Engine started";
    }

    public void accelerate(int speed){
        System.out.println("Car runs at speed " + speed + " km/hour");
    }

    public String brake(){
        accelerate(0);
        return "Car Stopped";
    }

}

class Lamborghini extends car{
    public Lamborghini(String cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String StartEngine() {
        return "Lambo's Engine Started";
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(speed);
    }

    @Override
    public String brake() {
        System.out.println("Brake pressed");
        accelerate(0);
        return "Lambo Stooped";
    }

}

class ferrari extends car{
    public ferrari(String cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String StartEngine() {
        return "Ferrari's Engine Started";
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(speed);
    }


}
public class Main {

    public static void main(String[] args) {
        car car = new car("4","baseCar");
        System.out.println(car.StartEngine());
        car.accelerate(20);
        car.brake();

        Lamborghini lamborghini = new Lamborghini("4","MyLambo");
        System.out.println(lamborghini.StartEngine());
        lamborghini.accelerate(200);
        System.out.println(lamborghini.brake());

        ferrari ferrari = new ferrari("6","MyFerrari");
        System.out.println(ferrari.StartEngine());
        ferrari.accelerate(300);
        System.out.println(ferrari.brake());


    }
}
