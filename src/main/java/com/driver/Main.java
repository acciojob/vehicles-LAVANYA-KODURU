package com.driver;

public class Main {
    public static void main(String[] args) {
      
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Boat yacht = new Boat("Yacht", 30);
        System.out.println("\nBoat Name: " + yacht.getVehicleName());
        System.out.println("Boat Capacity: " + yacht.getVehicleCapacity());
    }
}
