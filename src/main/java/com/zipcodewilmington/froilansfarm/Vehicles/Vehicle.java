package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public abstract class Vehicle implements Rideable, NoiseMaker { //abstract classes don't import implement methods??

    private Boolean hasBeenRiddenToday;
    private Boolean isBeingRidden;


    public Vehicle(){
        this.hasBeenRiddenToday = false;
        this.isBeingRidden = false;
    }

    @Override
    public void hasBeenRidden() {
        this.hasBeenRiddenToday = true;
    }

    @Override
    public void isBeingRidden() {
        setBeingRidden(true);
    }

    @Override
    public void stopRiding() {
        setBeingRidden(false);
    }

    public Boolean getHasBeenRiddenToday() {
        return hasBeenRiddenToday;
    }

    public void setHasBeenRiddenToday(Boolean hasBeenRiddenToday) {
        this.hasBeenRiddenToday = hasBeenRiddenToday;
    }

    public Boolean getBeingRidden() {
        return isBeingRidden;
    }

    public void setBeingRidden(Boolean beingRidden) {
        isBeingRidden = beingRidden;
    }



}
