package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;

public class TomatoPlant extends Crop {


    public TomatoPlant() {
        super();
    }


    public Tomato Yield() {
        if (this.getHasBeenHarvested().equals(false) && this.getHasBeenFertilized().equals(true)) {
            return new Tomato();
        }
        return null;
    }
}
