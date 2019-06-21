package com.zipcodewilmington.froilansfarm.Crops;

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





    public List<T> getCrops() {
        return crops;
    }

    public void setCrops(List<T> crops) {
        this.crops = crops;
    }


    public void addCrop(T crop) {
        crops.add(crop);
    }

//    public void forEachCrop(){
//        for
//    }

}
