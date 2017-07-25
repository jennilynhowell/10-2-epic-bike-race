package com.jennilyn;

import com.jennilyn.AbstractClasses.BaseRandom;

public class Bike extends BaseRandom {

    private double location;
    private double speed;


    public Bike() {
        location = 0.0;
        speed = 0.0;
    }

    public void move() {
        location = location + speed;
    }

    public void accelerate() {
        double magnitude = getAccelAmount();
         //allows bike to accel/decel without moving backward
        if ((speed + magnitude) > 0) {
            speed = speed + magnitude;
        }

    }

    public double getLocation() {
        return location;
    }

    public double getSpeed() {
        return speed;
    }

    public void report(){
        System.out.println("Location: " + getLocation());
        System.out.println("Speed: " + getSpeed());
    }
}
