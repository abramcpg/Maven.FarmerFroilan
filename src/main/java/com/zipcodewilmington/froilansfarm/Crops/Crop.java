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

    public boolean isFertilized() {
        return fertilized;
    }

    public void setFertilized(boolean fertilized) {
        this.fertilized = fertilized;
    }

    public boolean isHarvested() {

        return harvested;
    }

    public void setHarvested() {

        harvested = !harvested;
    }

    @Override
    public EdibleObject Yield() {
        return null;
    }


}