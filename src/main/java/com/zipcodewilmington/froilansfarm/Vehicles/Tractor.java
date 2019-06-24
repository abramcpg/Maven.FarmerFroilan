package com.zipcodewilmington.froilansfarm.Vehicles;


import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;

import java.util.ArrayList;
import java.util.List;

public class Tractor extends Vehicle implements FarmVehicle {


    public Tractor() {
        super();
    }
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

    public ArrayList<EdibleObject> harvest(CropRow cropRow){
        ArrayList<EdibleObject> foodList = new ArrayList<>();
        if (cropRow != null) {
            foodList = cropRow.harvestRow();
        }
        thisField.setHasBeenFertilized(false);
        //sets Field.hasBeenFertilized to false
        Barn.getInstance().addToStorage(foodList);
        return foodList;
    }


    public ArrayList<EdibleObject> operate() {
        ArrayList<EdibleObject> foodList = new ArrayList<>();
        for (CropRow row : Farm.getInstance().getField().getCropRows()) {
            foodList.addAll(harvest(row));
        }
        Farm.getInstance().getField().setHasBeenHarvested(true);
        return foodList;
    }


    public void operate(Farm farm) {

    }

}
