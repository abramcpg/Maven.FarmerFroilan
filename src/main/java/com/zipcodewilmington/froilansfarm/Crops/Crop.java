package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop implements Produce {

    private boolean fertilized;
    private boolean harvested;

    public Crop() {
        this.fertilized = false;
        this.harvested = false;
    }

    //required by Produce
    public EdibleObject yield() {
        return null;
    }


    public boolean hasBeenFertilized() {
        return fertilized;
    }


    public boolean isHarvested() {
        return harvested;
    }

    public void setHarvested() {
        harvested = !harvested;
    }

}