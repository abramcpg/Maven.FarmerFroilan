package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.ChickenCoup;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ChickenCoupTests{

    @Test
    public void addChickenTest(){
        ChickenCoup chickenCoup = new ChickenCoup();

        ArrayList<Chicken> expected = new ArrayList<>();
        Chicken Chicken1 = null;
        Chicken Chicken2 = null;
        Chicken Chicken3 = null;
        expected.add(Chicken1);
        expected.add(Chicken2);
        expected.add(Chicken3);

        //When
        chickenCoup.addChicken(Chicken1);
        chickenCoup.addChicken(Chicken2);
        chickenCoup.addChicken(Chicken3);

        //Then
        Assert.assertEquals(expected, chickenCoup.getChickens());
    }

    @Test
    public void removeChickenTest(){
        //Given
        ChickenCoup chickenCoup = new ChickenCoup();
        ArrayList<Chicken> expected = new ArrayList<>();
        Chicken Chicken1 = null;
        Chicken Chicken2 = null;
        Chicken Chicken3 = null;
        expected.add(Chicken1); //only add Chicken1 and Chicken2 to expected
        expected.add(Chicken2);


        //When
        chickenCoup.addChicken(Chicken1); //add 3 Chickens to actual
        chickenCoup.addChicken(Chicken2);
        chickenCoup.addChicken(Chicken3);

        chickenCoup.removeChicken((Chicken3));


        //Then
        Assert.assertEquals(expected, chickenCoup.getChickens() );
    }

    //No longer have setChicken method
    /*@Test
    public void setChickensTest(){
        //Given
        ChickenCoup chickenCoup = new ChickenCoup();
        ArrayList<Chicken> expected = new ArrayList<>();
        Chicken Chicken1 = null;
        Chicken Chicken2 = null;
        Chicken Chicken3 = null;
        expected.add(Chicken1);
        expected.add(Chicken2);
        expected.add(Chicken3);


        //When
        chickenCoup.setChickens(expected);

        //Then
        Assert.assertEquals(expected, chickenCoup.getChickens() );

    }*/
}