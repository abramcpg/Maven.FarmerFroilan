package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {




    public CropDuster() {
        super();
    }


    public void fertilize(Field field){
        Farm.getInstance().getField().fertilizeField();
        Farm.getInstance().getField().setHasBeenHarvested(false);
        //Farm.getInstance().getField().setHasBeenFertilized(true);
        //Sets Field,hasBeenFertilized to true
    }


    public void operate() {

    }


    public void operate(Farm farm) {
        fertilize(farm.getField());
    }
}
