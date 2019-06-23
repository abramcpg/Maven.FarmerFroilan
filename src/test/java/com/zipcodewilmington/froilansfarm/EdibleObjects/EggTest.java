package com.zipcodewilmington.froilansfarm.EdibleObjects;

import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {

    @Test
    public void HasNotBeenFertilizedTest() {
        Egg egg = new Egg();
        Boolean expected = false;
        Boolean actual = egg.getHasBeenFertilized();
        assertEquals(expected, actual);
    }

    @Test
    public void HasBeenFertilizedTest() {
        Egg egg = new Egg();
        egg.setHasBeenFertilized(true);
        Boolean expected = true;
        Boolean actual = egg.getHasBeenFertilized();
        assertEquals(expected, actual);
    }

    @Test
    public void HasBeenFertilizedTest2() {
        Egg egg = new Egg(true);
        Boolean expected = true;
        Boolean actual = egg.getHasBeenFertilized();
        assertEquals(expected, actual);
    }

    @Test
    public void setHasBeenFertilizedTest() {
        Egg egg = new Egg();
        egg.setHasBeenFertilized(true);
        Boolean expected = true;
        Boolean actual = egg.getHasBeenFertilized();
        assertEquals(expected, actual);
    }


}