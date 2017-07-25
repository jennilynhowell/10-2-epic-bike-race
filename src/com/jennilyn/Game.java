package com.jennilyn;

import java.util.ArrayList;
import java.util.List;

public class Game {

    List<Bike> bikes = new ArrayList<>();

    public void addBike(){
        Bike bike = new Bike();
        bikes.add(bike);
    }

    public void addBike(int count) {
        for (int i = 0; i < count; i++) {
            addBike();
        }
    }

    public void bikeReport() {
        for (Bike bike : bikes) {
            bike.report();
        }
    }

    public void startRace() {
        for (Bike bike : bikes) {
            bike.accelAndMove();
        }
    }

    public void startRace(int distance){
        for (Bike bike : bikes) {
            bike.accelAndMove(distance);
        }
    }

}
