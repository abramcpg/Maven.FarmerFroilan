package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {

    @Test
    public void makeNoise() {
        Chicken chicken = new Chicken();
        //when
        String expected = "B'Gock!";
        String actual = chicken.makeNoise();
        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void notFertilizedTest() {
        Chicken chicken = new Chicken();
        //when
        chicken.setHasBeenFertilized(false);
        //assert
        Assert.assertNotNull(chicken.Yield());
    }

    @Test
    public void fertilizedTest() {
        Chicken chicken = new Chicken();
        //when
        chicken.setHasBeenFertilized(true);
        //assert
        Assert.assertNull(chicken.Yield());
    }

    @Test
    public void eat() {
    }
}