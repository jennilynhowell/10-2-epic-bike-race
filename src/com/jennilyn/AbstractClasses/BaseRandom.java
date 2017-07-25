package com.jennilyn.AbstractClasses;

import java.util.Random;

public class BaseRandom {

    private Random rng = new Random();

    private double randomRange(double min, double max) {
        Double random = rng.nextDouble();
        return min + (random * (max - min));
    }

    public double getAccelAmount() {
        return randomRange(-1.0, 2.0);
    }

}
