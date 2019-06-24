package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RideTests {

    private Farmer froilan = new Farmer();
    private Horse horse1 = new Horse();
    Tractor tractor = new Tractor();
    CropDuster cropDuster = new CropDuster();


    @Before
    public void setUp(){
        horse1 = new Horse();
        tractor = new Tractor();
        cropDuster = new CropDuster();
        froilan = new Farmer();


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


    @Test
    public void rideTest7(){
        Assert.assertFalse(tractor.getHasBeenRiddenToday());
    }

    @Test
    public void rideTest8(){
        froilan.ride(cropDuster);
        Assert.assertTrue(cropDuster.getHasBeenRiddenToday());
    }

    @Test
    public void rideTest9(){
        Assert.assertFalse(cropDuster.getBeingRidden());
    }

    @Test
    public void rideTest10(){
        froilan.mount(cropDuster);
        Assert.assertTrue(cropDuster.getBeingRidden());
    }

    @Test
    public void rideTest11(){
        froilan.mount(cropDuster);
        froilan.dismount(cropDuster);
        Assert.assertFalse(cropDuster.getBeingRidden());
    }

    @Test
    public void rideTest12(){
        Assert.assertFalse(cropDuster.getHasBeenRiddenToday());
    }

    @Test
    public void rideTest13(){
        froilan.ride(cropDuster);
        Assert.assertTrue(cropDuster.getHasBeenRiddenToday());
    }

    @Test
    public void rideTest14(){
        Assert.assertFalse(cropDuster.getBeingRidden());
    }

    @Test
    public void rideTest15(){
        froilan.mount(cropDuster);
        Assert.assertTrue(cropDuster.getBeingRidden());
    }

    @Test
    public void rideTest16(){
        froilan.mount(cropDuster);
        froilan.dismount(cropDuster);
        Assert.assertFalse(cropDuster.getBeingRidden());
    }





}
