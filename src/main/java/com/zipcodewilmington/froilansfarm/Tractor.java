package com.zipcodewilmington.froilansfarm;


import java.util.List;

public class Tractor extends Vehicle implements FarmVehicle {
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
