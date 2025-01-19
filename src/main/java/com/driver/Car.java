package com.driver;

public class Car extends Vehicle {

    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    // Constructor for the Car class
    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name); // Call the Vehicle constructor to initialize the name
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1; // Assuming the car starts with gear 1
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);
    }
}
