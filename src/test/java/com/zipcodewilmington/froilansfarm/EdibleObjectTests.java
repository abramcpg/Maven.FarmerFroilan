package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class EdibleObjectTests {
    private Farm froilanFarm = Farm.getInstance();
    private Farmer froilan = new Farmer("Froilan");
    private ArrayList<EarCorn> cornList = new ArrayList<>();


    @Before
    public void setUp() {
        tearDown();
        cornList.add(new EarCorn());
        cornList.add(new EarCorn());
        cornList.add(new EarCorn());
        cornList.add(new EarCorn());
        cornList.add(new EarCorn());
        froilanFarm.getBarn().getCornStoreHouse().addEdibleObjects(cornList);
    }


    public void tearDown() {
        cornList.clear();
        froilanFarm.getBarn().getCornStoreHouse().clearStorehouse();
    }

    @Test
    public void test1(){
        Assert.assertTrue(cornList.get(0) instanceof EdibleObject);
    }

    @Test
    public void addCorn(){
        Integer expected = 5;
        Integer actual = froilanFarm.getBarn().getCornStoreHouse().getAmountInStorage();

        Assert.assertEquals(expected, actual);
        tearDown();
    }

    @Test
    public void eatTest(){
        froilan.eat(new EarCorn(), 4);

        Integer expected = 1;
        Integer actual = froilanFarm.getBarn().getCornStoreHouse().getAmountInStorage();

        Assert.assertEquals(expected, actual);
        tearDown();
    }

    @Test
    public void notEnoughFoodTest(){
        froilan.eat(new EarCorn(), 20);

        Integer expected = 0;
        Integer actual = froilanFarm.getBarn().getCornStoreHouse().getAmountInStorage();

        Assert.assertEquals(expected, actual);
        tearDown();
    }



}
