package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoup {
    List<Chicken> chickens;

    public ChickenCoup() {
        this.chickens = new ArrayList<>();
    }


    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }

    public void removeChicken(Chicken chicken){

    }
    public List<Chicken> getChickens() {
        return chickens;
    }

}
