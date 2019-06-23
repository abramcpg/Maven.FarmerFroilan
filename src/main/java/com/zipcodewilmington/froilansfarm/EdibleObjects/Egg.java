package com.zipcodewilmington.froilansfarm.EdibleObjects;

import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;
import java.util.List;


public class Egg implements Produce, EdibleObject {

    private Boolean hasBeenFertilized;

    public Egg(){
        this.hasBeenFertilized = false;
    }

    public int getDailyEdibleEggs(int numberOfChickens){  //int is numberOfChickens
        int edibleCount =0 ;
        for (int i = 0; i < numberOfChickens; i=i+2) {
                edibleCount++;
        }
        return edibleCount;
    }


    public Egg(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    @Override
    public EdibleObject Yield() {

        return null;
    }
}

//Maybe random number generator and two list, edible and notEdible. If even, add to one vs other
//And just Eggs class