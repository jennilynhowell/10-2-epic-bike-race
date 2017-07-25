package com.jennilyn.Tests;
import static org.junit.Assert.*;

import com.jennilyn.Bike;
import com.jennilyn.Game;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PhotoFinishTest {

    @Test
    public void photoFinishReturnsBikeWithHighestLocation(){
        Bike one = new Bike();
        Bike two = new Bike();
        Bike three = new Bike();

        one.accelAndMove(1000);
        two.accelAndMove(100);
        three.accelAndMove(1);

        List<Bike> finishers = new ArrayList<>();

        finishers.add(two);
        finishers.add(three);
        finishers.add(one);

        Bike winner = Game.photoFinish(finishers);
        assertEquals(winner, one);
    }
}
