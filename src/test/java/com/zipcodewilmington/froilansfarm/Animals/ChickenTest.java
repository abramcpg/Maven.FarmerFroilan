package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.CarrotStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.CornStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.EggStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.TomatoStoreHouse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {
    private Farm froilanFarm = Farm.getInstance();
    private CornStoreHouse cornHouse = froilanFarm.getBarn().getCornStoreHouse();
    private TomatoStoreHouse tomatoHouse = froilanFarm.getBarn().getTomatoStoreHouse();
    private EggStoreHouse eggHouse = froilanFarm.getBarn().getEggStoreHouse();
    private CarrotStoreHouse carrotStoreHouse = froilanFarm.getBarn().getCarrotStoreHouse();
    private Farmer froilan = new Farmer();
    private Horse horse = new Horse();
    private Pilot pilot = new Pilot();

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
        Chicken chicken = new Chicken();
        CornStoreHouse cornHouse = froilanFarm.getBarn().getCornStoreHouse();
        cornHouse.addEdibleObject(new EarCorn());
        cornHouse.addEdibleObject(new EarCorn());
        cornHouse.addEdibleObject(new EarCorn());
        cornHouse.addEdibleObject(new EarCorn());
        chicken.eat(new EarCorn(), 3);
        Integer expected = 1;
        Integer cornStorage = cornHouse.getAmountInStorage();
        Assert.assertEquals(expected, cornStorage);
    }

}