package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;

import java.util.ArrayList;
import java.util.List;

//make fixed array?
public class CropRow <T extends Crop>{
    private List<T> crops;


    public CropRow() {
        this.crops = new ArrayList<>();
    }


    public CropRow(List<T> crops) {
        this.crops = crops;
    }




    public Crop getCrop(Integer index) {
        return crops.get(index);
    }

    public List<T> getCrops() {
        return crops;
    }

    public void setCrops(List<T> crops) {
        this.crops = crops;
    }


    public void addCrop(T crop) {
        crops.add(crop);
    }


    public void addMultipleToCropRow(Crop crop, Integer amount){
        for (int i = 0; i < amount; i++){
            crops.add((T) crop);
        }
    }


    public ArrayList<EdibleObject> rowYield(){
        ArrayList<EdibleObject> cropYield = new ArrayList<>();
        for (Crop crop : crops){
            cropYield.add(crop.Yield());
        }
        return cropYield;
    }


    public void fertilizeRow(){
        for (Crop crop : this.crops){
            crop.setHasBeenFertilized(true);
        }
    }


    public ArrayList<EdibleObject> harvestRow() {
        ArrayList<EdibleObject> cropList = new ArrayList<>();
        for (Crop crop : crops) {
            cropList.add(crop.Yield());
            //crop.setHasBeenHarvested(true);
        }
        for (Crop crop : crops) {
            crop.setHasBeenHarvested(true);
            crop.setHasBeenFertilized(false);
        }
        return cropList;
    }



}
