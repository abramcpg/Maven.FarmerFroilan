package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;

public class TomatoPlant extends Crop {


    public TomatoPlant() {
        super();
    }


    public Tomato Yield() {

        return new Tomato();
    }
}
