package com.zipcodewilmington.froilansfarm.Vehicles;


import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

import java.util.List;

public class Tractor extends Vehicle implements FarmVehicle {


    public Tractor() {}


    public String makeNoise() {
        return "Vrooom";
    }
    public List<Crop> harvest(CropRow cropRow){
        //sets Field.hasBeenFertilized to false
        return null;
    }

    public void operate() {

    }

    public void operate(Farm farm) {

    }
}
