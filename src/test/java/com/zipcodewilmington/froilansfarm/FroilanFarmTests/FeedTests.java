package com.zipcodewilmington.froilansfarm.FroilanFarmTests;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Carrot;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.FroilanFarm.FroilanFarm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FeedTests {

    public FroilanFarm froilanFarm = FroilanFarm.getInstance();
    public Farmer froilan = (Farmer) froilanFarm.getFarm().getFarmHouse().getPeople().get(0);


    @Before
    public void setUp(){
        froilanFarm.setUp();
    }


    @Test
    public void feedTest1(){
        Chicken chicken = froilanFarm.getFarm().getChickenCoops().get(0).getChickens().get(0);
        Assert.assertFalse(chicken.getHasBeenFed());
    }

    @Test
    public void feedTest2(){
        froilan.feedChickens(new EarCorn(), 3);
        Chicken chicken = froilanFarm.getFarm().getChickenCoops().get(0).getChickens().get(0);

        Assert.assertTrue(chicken.getHasBeenFed());
    }

    @Test
    public void feedTest3(){
        Horse horse = froilanFarm.getFarm().getStables().get(0).getHorses().get(1);
        Assert.assertFalse(horse.getHasBeenFed());
    }



    @Test
    public void feedTest4(){
        froilan.feedHorses(new EarCorn(), 3);
        Horse horse = froilanFarm.getFarm().getStables().get(0).getHorses().get(1);

        Assert.assertTrue(horse.getHasBeenFed());
    }

    @Test
    public void feedTest5(){
        froilan.feedHorses(new EarCorn(), 3);
        Integer expected = 270;
        Integer actual = froilanFarm.getFarm().getBarn().getCornStoreHouse().getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void feedTest6(){
        froilan.feedChickens(new Carrot(), 3);
        Integer expected = 255;
        Integer actual = froilanFarm.getFarm().getBarn().getCarrotStoreHouse().getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }


}
