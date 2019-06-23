package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RideTests {

    private Farmer froilan = new Farmer();
    private Horse horse1 = new Horse();

    @Before
    public void setUp(){
        horse1 = new Horse();
    }



    @Test
    public void rideTest1(){
        Assert.assertFalse(horse1.getHasBeenRiddenToday());
    }

    @Test
    public void rideTest2(){
        froilan.ride(horse1);
        Assert.assertTrue(horse1.getHasBeenRiddenToday());
    }

    @Test
    public void rideTest3(){
        Assert.assertFalse(horse1.getBeingRidden());
    }

    @Test
    public void rideTest4(){
        froilan.mount(horse1);
        Assert.assertTrue(horse1.getBeingRidden());
    }

    @Test
    public void rideTest5(){
        froilan.mount(horse1);
        froilan.dismount(horse1);
        Assert.assertFalse(horse1.getBeingRidden());
    }





}
