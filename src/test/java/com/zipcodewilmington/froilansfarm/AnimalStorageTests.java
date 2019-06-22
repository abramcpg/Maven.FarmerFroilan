package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.ChickenCoup;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class AnimalStorageTests {

    private Farm froilanFarm = Farm.getInstance();

    @Before
    public void setUp() {}

    @After
    public void tearDown() {
        froilanFarm.setStables(new ArrayList<>());
        froilanFarm.setChickenCoops(new ArrayList<>());
    }


    @Test
    public void isEmptyTest(){
        Integer expected = 0;
        Integer actual = froilanFarm.getChickenCoops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest2(){
        Integer expected = 0;
        Integer actual = froilanFarm.getStables().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hasOneStableTest(){
        froilanFarm.addStable(new Stable());
        Integer expected = 1;
        Integer actual = froilanFarm.getStables().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addHorseTest(){
        froilanFarm.addStable(new Stable());
        froilanFarm.getStables().get(0).addHorse(new Horse());


        Integer expected = 1;
        Integer actual = froilanFarm.getStables().get(0).getNumberOfHorses();

        Assert.assertEquals(expected, actual);
    }






}
