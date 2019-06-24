package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Carrot;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class EatingTests {
    private Farm froilanFarm = Farm.getInstance();
    private CornStoreHouse cornHouse = froilanFarm.getBarn().getCornStoreHouse();
    private TomatoStoreHouse tomatoHouse = froilanFarm.getBarn().getTomatoStoreHouse();
    private EggStoreHouse eggHouse = froilanFarm.getBarn().getEggStoreHouse();
    private CarrotStoreHouse carrotStoreHouse = froilanFarm.getBarn().getCarrotStoreHouse();
    private Farmer froilan = new Farmer();
    private Horse horse = new Horse();
    private Pilot pilot = new Pilot();



    @Before
    public void setUp(){
        tearDown();
        ArrayList<EdibleObject> foodList = new ArrayList<>();
        foodList.add(new Tomato());
        foodList.add(new Tomato());
        foodList.add(new Tomato());
        foodList.add(new Tomato());
        foodList.add(new Tomato());
        foodList.add(new Egg());
        foodList.add(new Egg());
        foodList.add(new Egg());
        foodList.add(new Egg());
        foodList.add(new Egg());
        foodList.add(new EarCorn());
        foodList.add(new EarCorn());
        foodList.add(new EarCorn());
        foodList.add(new EarCorn());
        foodList.add(new EarCorn());
        foodList.add(new Carrot());
        foodList.add(new Carrot());
        foodList.add(new Carrot());
        foodList.add(new Carrot());
        foodList.add(new Carrot());

        Barn.getInstance().addToStorage(foodList);
    }

    @After
    public void tearDown(){
        cornHouse.clearStorehouse();
        tomatoHouse.clearStorehouse();
        eggHouse.clearStorehouse();
        carrotStoreHouse.clearStorehouse();
    }


    @Test
    public void checkStorage(){
        Integer expected = 5;
        Integer cornStorage = cornHouse.getAmountInStorage();
        Integer tomatoStorage = tomatoHouse.getAmountInStorage();
        Integer eggStorage = eggHouse.getAmountInStorage();
        Integer carrotStorage = carrotStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, cornStorage);
        Assert.assertEquals(expected, tomatoStorage);
        Assert.assertEquals(expected, eggStorage);
        Assert.assertEquals(expected, carrotStorage);
        tearDown();
    }

    @Test
    public void farmerEat(){
        froilan.eat(new EarCorn(), 3);

        Integer expected = 2;
        Integer cornStorage = cornHouse.getAmountInStorage();

        Assert.assertEquals(expected, cornStorage);
        tearDown();
    }

    @Test
    public void farmerEat2(){
        froilan.eat(new Tomato(), 1);

        Integer expected = 4;
        Integer tomatoStorage = tomatoHouse.getAmountInStorage();

        Assert.assertEquals(expected, tomatoStorage);
        tearDown();
    }

    @Test
    public void farmerEat3(){
        froilan.eat(new Egg(), 4);

        Integer expected = 1;
        Integer eggStorage = eggHouse.getAmountInStorage();

        Assert.assertEquals(expected, eggStorage);
        tearDown();
    }

    @Test
    public void farmerEat4(){
        froilan.eat(new Carrot(), 4);

        Integer expected = 1;
        Integer carrotStorage = carrotStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, carrotStorage);
        tearDown();
    }

    @Test
    public void horseEat(){
        horse.eat(new EarCorn(), 3);

        Integer expected = 2;
        Integer cornStorage = cornHouse.getAmountInStorage();

        Assert.assertEquals(expected, cornStorage);
        tearDown();
    }

    @Test
    public void horseEat2(){
        horse.eat(new Tomato(), 1);

        Integer expected = 4;
        Integer tomatoStorage = tomatoHouse.getAmountInStorage();

        Assert.assertEquals(expected, tomatoStorage);
        tearDown();
    }

    @Test
    public void horseEat3(){
        horse.eat(new Egg(), 4);

        Integer expected = 1;
        Integer eggStorage = eggHouse.getAmountInStorage();

        Assert.assertEquals(expected, eggStorage);
        tearDown();
    }

    @Test
    public void horseEat4(){
        horse.eat(new Carrot(), 2);

        Integer expected = 3;
        Integer carrotStorage = carrotStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, carrotStorage);
        tearDown();
    }


    @Test
    public void pilotEat(){
        pilot.eat(new EarCorn(), 3);

        Integer expected = 2;
        Integer cornStorage = cornHouse.getAmountInStorage();

        Assert.assertEquals(expected, cornStorage);
        tearDown();
    }

    @Test
    public void pilotEat2(){
        pilot.eat(new Tomato(), 1);

        Integer expected = 4;
        Integer tomatoStorage = tomatoHouse.getAmountInStorage();

        Assert.assertEquals(expected, tomatoStorage);
        tearDown();
    }

    @Test
    public void pilotEat3(){
        pilot.eat(new Egg(), 4);

        Integer expected = 1;
        Integer eggStorage = eggHouse.getAmountInStorage();

        Assert.assertEquals(expected, eggStorage);
        tearDown();
    }

    @Test
    public void pilotEat4(){
        pilot.eat(new Carrot(), 1);

        Integer expected = 4;
        Integer carrotStorage = carrotStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, carrotStorage);
        tearDown();
    }








}
