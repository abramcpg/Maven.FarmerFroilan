package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    private Boolean hasBeenRiddenToday;
    private Boolean isBeingRidden;


    public Horse() {
        super();
        this.hasBeenRiddenToday = false;
        this.isBeingRidden = false;
    }


    public String makeNoise() {

        return "Hello, Farmer Froilan. It is good to see you.";
    }


    public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {
        super.eat(edibleObject, numberOfEdibles);
    }

    @Override
    public void hasBeenRidden() {
        this.hasBeenRiddenToday = true;
    }

    @Override
    public void isBeingRidden() {
        setBeingRidden(true);
    }

    @Override
    public void stopRiding() {
        setBeingRidden(false);
    }


    public Boolean getHasBeenRiddenToday() {
        return hasBeenRiddenToday;
    }

    public void setHasBeenRiddenToday(Boolean hasBeenRiddenToday) {
        this.hasBeenRiddenToday = hasBeenRiddenToday;
    }

    public Boolean getBeingRidden() {
        return isBeingRidden;
    }

    public void setBeingRidden(Boolean beingRidden) {
        isBeingRidden = beingRidden;
    }
}
