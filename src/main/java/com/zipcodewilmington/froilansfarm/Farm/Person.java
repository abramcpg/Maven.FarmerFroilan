package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.EdibleObjects.Carrot;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Person implements NoiseMaker, Eater {
    private String name;

    public Person(){
        this.name = "noName";
    }


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {

        if (edibleObject instanceof EarCorn){
            Farm.getInstance().getBarn().getCornStoreHouse().removeEdible(new EarCorn(), numberOfEdibles);
        } else if (edibleObject instanceof Tomato){
            Farm.getInstance().getBarn().getTomatoStoreHouse().removeEdible(new Tomato(), numberOfEdibles);
        } else if (edibleObject instanceof Egg){
            Farm.getInstance().getBarn().getEggStoreHouse().removeEdible(new Egg(), numberOfEdibles);
        } else if (edibleObject instanceof Carrot){
            Farm.getInstance().getBarn().getCarrotStoreHouse().removeEdible(new Carrot(), numberOfEdibles);
        } else {
            System.out.println("Error!");
        }
    }



}
