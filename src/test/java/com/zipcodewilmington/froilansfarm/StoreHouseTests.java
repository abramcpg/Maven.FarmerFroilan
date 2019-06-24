package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.ChickenCoup;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.CornStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.EggStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.TomatoStoreHouse;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StoreHouseTests {

    private Farm froilanFarm = Farm.getInstance();
    private CornStoreHouse cornStoreHouse = froilanFarm.getBarn().getCornStoreHouse();
    private TomatoStoreHouse tomatoStoreHouse = froilanFarm.getBarn().getTomatoStoreHouse();
    private EggStoreHouse eggStoreHouse = froilanFarm.getBarn().getEggStoreHouse();
    private CornStalk cornStalk = new CornStalk();
    private TomatoPlant tomatoPlant = new TomatoPlant();


    @Before
    public void setUp(){
        tearDown();
    }

    @After
    public void tearDown(){
        cornStoreHouse.clearStorehouse();
        tomatoStoreHouse.clearStorehouse();
        eggStoreHouse.clearStorehouse();
    }


    @Test
    public void cornHouseTest1(){
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());

        Integer expected = 2;
        Integer actual = cornStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cornHouseTest2() {
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());

        Integer expected = 4;
        Integer actual = cornStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cornHouseTest3(){
        Integer expected = 0;
        Integer actual = cornStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void tomatoTest1(){
        ArrayList<Tomato> tomatoList = new ArrayList<>();
        tomatoList.add(new Tomato());
        tomatoList.add(new Tomato());
        tomatoList.add(tomatoPlant.Yield());

        tomatoStoreHouse.addEdibleObjects(tomatoList);

        Integer expected = 3;
        Integer actual = tomatoStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tomatoTest2(){
        ArrayList<Tomato> tomatoList = new ArrayList<>();
        tomatoList.add(new Tomato());
        tomatoList.add(new Tomato());
        tomatoList.add(new Tomato());
        tomatoList.add(tomatoPlant.Yield());

        tomatoStoreHouse.addEdibleObjects(tomatoList);

        Integer expected = 4;
        Integer actual = tomatoStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tomatoTest3() {
        ArrayList<Tomato> tomatoList = new ArrayList<>();
        tomatoList.add(new Tomato());
        tomatoList.add(tomatoPlant.Yield());

        tomatoStoreHouse.addEdibleObjects(tomatoList);

        Integer expected = 2;
        Integer actual = tomatoStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tomatoTest4() {
        ArrayList<Tomato> tomatoList = new ArrayList<>();

        tomatoStoreHouse.addEdibleObjects(tomatoList);

        Integer expected = 0;
        Integer actual = tomatoStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void eatCornTest(){
        Farmer froilan = new Farmer("Froilan");
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());

        froilan.eat(new EarCorn(), 3);


        Integer expected = 2;
        Integer actual = cornStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatCornTest2(){
        Farmer froilan = new Farmer("Froilan");
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());

        froilan.eat(new EarCorn(), 4);


        Integer expected = 4;
        Integer actual = cornStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatCornTest3(){
        Farmer froilan = new Farmer("Froilan");
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());
        cornStoreHouse.addEdibleObject(cornStalk.Yield());

        froilan.eat(new EarCorn(), 2);

        Integer expected = 1;
        Integer actual = cornStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTomatoTest(){
        Farmer froilanda = new Farmer("Froilanda");
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());

        froilanda.eat(new Tomato(), 3);


        Integer expected = 3;
        Integer actual = tomatoStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTomatoTest2(){
        Farmer froilanda = new Farmer("Froilanda");
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());


        froilanda.eat(new Tomato(), 1);


        Integer expected = 2;
        Integer actual = tomatoStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTomatoTest3(){
        Farmer froilanda = new Farmer("Froilanda");
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());
        tomatoStoreHouse.addEdibleObject(tomatoPlant.Yield());


        froilanda.eat(new Tomato(), 2);


        Integer expected = 1;
        Integer actual = tomatoStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eggTest(){
        ArrayList<ChickenCoup> coups = new ArrayList<>();
        ChickenCoup chickenCoup = new ChickenCoup();
        chickenCoup.addChicken(new Chicken());
        chickenCoup.addChicken(new Chicken());
        chickenCoup.addChicken(new Chicken());
        ChickenCoup chickenCoup2 = new ChickenCoup();
        chickenCoup2.addChicken(new Chicken());
        chickenCoup2.addChicken(new Chicken());
        coups.add(chickenCoup);
        coups.add(chickenCoup2);
        froilanFarm.setChickenCoops(coups);

        Farmer froilan = new Farmer("Froilan");

        froilan.getEggs();

        Integer expected = 5;
        Integer actual = eggStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }



}
