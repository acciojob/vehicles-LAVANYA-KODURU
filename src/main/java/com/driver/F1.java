package com.driver;

public class F1 extends Car {

    // Constructor for F1, inheriting from Car
    public F1(String name, boolean isManual) {
        // F1 car has specific attributes, so pass values to the Car constructor
        super(name, 4, 2, 6, isManual, "F1", 2); // 4 wheels, 2 doors, 6 gears, 2 seats
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        
        // Adjust gear based on speed
        if (newSpeed == 0) {
            changeGear(1); // Stop the car, set gear 1
        } else if (newSpeed >= 1 && newSpeed <= 50) {
            changeGear(1);
        } else if (newSpeed >= 51 && newSpeed <= 100) {
            changeGear(2);
        } else if (newSpeed >= 101 && newSpeed <= 150) {
            changeGear(3);
        } else if (newSpeed >= 151 && newSpeed <= 200) {
            changeGear(4);
        } else if (newSpeed >= 201 && newSpeed <= 250) {
            changeGear(5);
        } else if (newSpeed > 250) {
            changeGear(6);
        }

        changeSpeed(newSpeed, getCurrentDirection());
    }
}
