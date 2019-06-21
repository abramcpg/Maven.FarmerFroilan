package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

import java.sql.SQLOutput;

public class Farmer extends Person implements Botanist, Rider {


    public Farmer() {
        super();
    }

    public Farmer(String name) {
        super(name);
    }


    public String makeNoise() {

        return "Dang nabbit!";
    }

    public void plant(Crop crop) {

    }


    public void pilot() {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    public void ride(Rideable rideable) {

    }

    public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {
        String switcher = edibleObject.getClass().toString();
        System.out.println(switcher);

        switch (switcher) {
            case "class com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn":
                Farm.getInstance().getBarn().getCornStoreHouse().removeEdible(new EarCorn(), numberOfEdibles);
                break;
            case "class com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato":
                Farm.getInstance().getBarn().getTomatoStoreHouse().removeEdible(new Tomato(), numberOfEdibles);
                break;
            case "class com.zipcodewilmington.froilansfarm.EdibleObjects.Egg":
                Farm.getInstance().getBarn().getEggStoreHouse().removeEdible(new Egg(), numberOfEdibles);
                break;
            default :
                System.out.println("Error!!!");
                break;
        }
    }
}
