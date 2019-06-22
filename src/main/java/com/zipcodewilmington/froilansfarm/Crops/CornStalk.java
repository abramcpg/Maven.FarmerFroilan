package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;

import java.util.ArrayList;
import java.util.List;

public class CornStalk extends Crop {


    public CornStalk() {

    }


    @Override
    public EdibleObject Yield() {
        return super.Yield();
    }

    @Override
    public boolean isFertilized() {
        return super.isFertilized();
    }

    @Override
    public void setFertilized(boolean fertilized) {
        super.setFertilized(fertilized);
    }

    @Override
    public boolean isHarvested() {
        return super.isHarvested();
    }

    @Override
    public void setHarvested() {
        super.setHarvested();
    }


}
