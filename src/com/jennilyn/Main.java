package com.jennilyn;

public class Main {

    public static void main(String[] args) {

        Bike bike = new Bike();
        Bike jBike = new Bike();

        bike.accelAndMove(10000);
        System.out.println("Computer:");
        bike.report();

        jBike.accelAndMove(10000);
        System.out.println("Jennilyn:");
        jBike.report();

    }
}
