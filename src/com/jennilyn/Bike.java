package com.jennilyn;

import com.jennilyn.AbstractClasses.BaseRandom;

public class Bike extends BaseRandom {

    private double location;
    private double speed;
    private double topSpeed;


    public Bike() {
        location = 0.0;
        speed = 0.0;
        topSpeed = getTopSpeed();
    }

    public void move() {
        location = location + speed;
    }

    public void move(int count) {
        for (int i = 0; i < count; i++) {
            move();
        }
    }

    public void accelerate() {
        double magnitude = getAccelAmount();
        double newSpeed = speed + magnitude;
         //allows bike to accel/decel without moving backward
        if (newSpeed > 0 && newSpeed <= topSpeed) {
            speed = speed + magnitude;
        }
    }

    public void accelAndMove() {
        if (shouldAccel()) {
            accelerate();
        }
        move();
    }

    public void accelAndMove(int count) {
        for (int i = 0; i < count; i++) {
            accelAndMove();
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
