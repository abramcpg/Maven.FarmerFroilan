package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.EdibleObjects.Carrot;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.Person;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {

    private Boolean hasBeenFed;

    public Animal(){
        this.hasBeenFed = false;
    }



    public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {
        Farmer eater = new Farmer();
        eater.eat(edibleObject, numberOfEdibles);
    }

    public Boolean getHasBeenFed() {
        return hasBeenFed;
    }

    public void setHasBeenFed(Boolean hasBeenFed) {
        this.hasBeenFed = hasBeenFed;
    }
}
