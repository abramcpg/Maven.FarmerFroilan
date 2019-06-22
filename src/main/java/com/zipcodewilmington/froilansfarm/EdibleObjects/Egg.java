package com.zipcodewilmington.froilansfarm.EdibleObjects;

import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;

public class Egg implements EdibleObject {
    private Boolean hasBeenFertilized;

    public Egg(){}


    public Egg(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}

//Maybe random number generator and two list, edible and notEdible. If even, add to one vs other
//And just Eggs class