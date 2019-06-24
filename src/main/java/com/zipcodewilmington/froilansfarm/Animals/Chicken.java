package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {


    private Boolean hasBeenFertilized;

    public Chicken() {
        this.hasBeenFertilized = false;
    }


    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public String makeNoise() {
        return "B'Gock!";
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Egg Yield() {
        if (hasBeenFertilized.equals(false)) {
            return new Egg();
        }
        return null;
    }


    public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {
        super.eat(edibleObject, numberOfEdibles);
    }
}
