package com.zipcodewilmington.froilansfarm.Animals;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenCoupTest {

    @Test
    public void addChicken() {
        ChickenCoup chickenCoup = new ChickenCoup();
        Chicken chicken = new Chicken();
        chickenCoup.addChicken(chicken);
        chickenCoup.addChicken(chicken);
        //assert
        int expected = 2;
        int actual = chickenCoup.chickens.size();
        assertEquals(expected, actual);
    }

    @Test
    public void getChickens() {
        ChickenCoup chickenCoup = new ChickenCoup();
        Chicken chicken = new Chicken();
        chickenCoup.addChicken(chicken);
        chickenCoup.addChicken(chicken);
        chickenCoup.addChicken(chicken);
        chickenCoup.addChicken(chicken);
        Integer expected = 4;
        Integer actual = (chickenCoup.getChickens().size());
        assertEquals(expected, actual);
    }

}