package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoup {
    List<Chicken> chickens;

    public ChickenCoup() {
        this.chickens = new ArrayList<>();
    }


    public void addChicken(){}

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(List<Chicken> chickens) {
        this.chickens = chickens;
    }
}
