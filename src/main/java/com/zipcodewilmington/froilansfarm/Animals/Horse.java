package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    public Horse() {
    }

    public void eat() {

    }

    public String makeNoise() {

        return "Hello, Farmer Froilan. It is good to see you.";
    }


    public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {

    }
}
