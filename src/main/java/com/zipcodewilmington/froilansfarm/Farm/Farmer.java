package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
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


    public void plantRow(Crop crop, CropRow<?> cropRow, Integer amount) {
        cropRow.addMultipleToCropRow(crop, amount);
    }




    public void pilot() {

    }

    public void mount(Rideable rideable) {
        rideable.isBeingRidden();

    }

    public void dismount(Rideable rideable) {
        rideable.stopRiding();

    }

    public void ride(Rideable rideable) {
        rideable.hasBeenRidden();
    }

    public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {
        super.eat(edibleObject, numberOfEdibles);
    }
}
