package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {



    public Chicken() {}



    public String makeNoise() {
        return "B'Gock!";
    }



    public Egg Yield() {
        return new Egg();
    }


    public void eatFood(EdibleObject edibleObject, Integer numberOfEdibles) {

    }

    @Override
    public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {

    }
}
