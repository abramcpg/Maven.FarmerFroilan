package com.zipcodewilmington.froilansfarm.Vehicles;


import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

import java.util.List;

public class Tractor extends Vehicle implements FarmVehicle {


    public Tractor() {}
    private Field thisField = new Field();

    public String makeNoise() {
        return "Vrooom";
    }

    public Field getThisField() {
        return thisField;
    }

    public void setThisField(Field thisField) {
        this.thisField = thisField;
    }

    public List<Crop> harvest(CropRow cropRow){

        thisField.setHasBeenFertilized(false);
        //sets Field.hasBeenFertilized to false
        return null;
    }


    public void operate() {

    }


    public void operate(Farm farm) {

    }

    @Override
    public void hasBeenRidden() {

    }

    @Override
    public void isBeingRidden() {

    }

    @Override
    public void stopRiding() {

    }
}
