package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {
    public void eat() {

    }

    public String makeNoise() {

        return "B'Gock!";
    }

    public EdibleObject Yield() {


        return null;
    }


    public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {

    }
}
