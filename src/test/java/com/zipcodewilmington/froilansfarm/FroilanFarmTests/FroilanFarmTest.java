package com.zipcodewilmington.froilansfarm.FroilanFarmTests;

import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.FroilanFarm.FroilanFarm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FroilanFarmTest {

    public FroilanFarm froilanFarm = FroilanFarm.getInstance();
    public Farmer froilan = (Farmer) froilanFarm.getFarm().getFarmHouse().getPeople().get(0);


    @Before
    public void setUp(){
        froilanFarm.setUp();
    }

    @Test
    public void testPeople(){
        Integer expected = 2;
        Integer actual = froilanFarm.getFarm().getFarmVehicles().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHorses(){
        Integer expected = 4;
        Integer actual = froilanFarm.getFarm().getStables().get(0).getNumberOfHorses();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHorses2(){
        Integer expected = 3;
        Integer actual = froilanFarm.getFarm().getStables().get(1).getNumberOfHorses();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChickens(){
        Integer expected = 5;
        Integer actual = froilanFarm.getFarm().getChickenCoops().get(0).getChickens().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChickens2(){
        Integer expected = 3;
        Integer actual = froilanFarm.getFarm().getChickenCoops().get(2).getChickens().size();

        Assert.assertEquals(expected, actual);
    }




    @Test
    public void foodTest1(){
        Integer expected = 300;
        Integer actual = froilanFarm.getFarm().getBarn().getCornStoreHouse().getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void foodTest2(){
        Integer expected = 300;
        Integer actual = froilanFarm.getFarm().getBarn().getEggStoreHouse().getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void foodTest3(){
        Integer expected = 300;
        Integer actual = froilanFarm.getFarm().getBarn().getTomatoStoreHouse().getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void foodTest4(){
        Integer expected = 300;
        Integer actual = froilanFarm.getFarm().getBarn().getCarrotStoreHouse().getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }








}
