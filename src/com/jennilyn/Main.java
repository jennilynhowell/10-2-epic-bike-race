package com.jennilyn;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        //game.setFinishLine(1000);
        game.addBike(5);
        game.startRace();
        game.bikeReport();

    }
}
