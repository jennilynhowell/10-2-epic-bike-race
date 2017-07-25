package com.jennilyn;

import java.util.ArrayList;
import java.util.List;

public class Game {

    List<Bike> bikes = new ArrayList<>();
    private int finishLine = 100;

    public void addBike(){
        Bike bike = new Bike();
        bikes.add(bike);
    }

    public void addBike(int count) {
        for (int i = 0; i < count; i++) {
            addBike();
        }
    }

    public void startRace() {
        boolean raceActive = true;
        List<Bike> finishers = new ArrayList<>();
        while (raceActive) {
            moveBikes();
            for (Bike bike : bikes) {
                if (bike.getLocation() >= finishLine) {
                    finishers.add(bike);
                    raceActive = false;
                }
            }
        }
        if (finishers.size() > 1) {
            System.out.println("**********");
            System.out.println("We have a photo finish!");
            photoFinish(finishers).report();
        } else {
            System.out.println("**********");
            System.out.println("We have a Winner!");
            finishers.get(0).report();
        }

    }

    public void setFinishLine(int newFinishLine) {
        finishLine = newFinishLine;
    }

    public void bikeReport() {
        for (Bike bike : bikes) {
            bike.report();
        }
    }

    public void moveBikes() {
        for (Bike bike : bikes) {
            bike.accelAndMove();
        }
    }

    public void moveBikes(int count){
        for (Bike bike : bikes) {
            bike.accelAndMove(count);
        }
    }

    public static Bike photoFinish(List<Bike> finishers) {
        //set winner to first one in order to get the comparison to work
        Bike winner = finishers.get(0);

        for(Bike bike : finishers) {
            if (bike.getLocation() > winner.getLocation()) {
                winner = bike;
            }
        }

        return winner;
    }


}
