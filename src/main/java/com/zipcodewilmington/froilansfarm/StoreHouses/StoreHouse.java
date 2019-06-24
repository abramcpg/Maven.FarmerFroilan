package com.zipcodewilmington.froilansfarm.StoreHouses;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;

import java.util.ArrayList;
import java.util.List;

public abstract class StoreHouse <T extends EdibleObject>{ //T makes it generic

    private List<T> edibleObjects;


    public StoreHouse() {
        this.edibleObjects = new ArrayList<>();
    }

    public StoreHouse(List<T> edibleObjects) {
        this.edibleObjects = edibleObjects;
    }


    public List<T> getEdibleObjects() {
        return edibleObjects;
    }

    public void setEdibleObjects(List<T> edibleObjects) {
        this.edibleObjects = edibleObjects;
    }


    public void addEdibleObject(T edibleObject){
        edibleObjects.add(edibleObject);
    }

    public void addEdibleObjects(List<T> edibleObject){
//        for (T edible : edibleObject){
//            edibleObjects.add(edible);
//        }
        edibleObjects.addAll(edibleObject);
    }

    public void clearStorehouse(){
        edibleObjects.clear();
    }


    public Integer getAmountInStorage(){
        return edibleObjects.size();
    }

    public void removeEdible(T edible, Integer numberOfEdibles){
        if (numberOfEdibles > getAmountInStorage()){
            clearStorehouse();
            System.out.println("Not enough food in storage");
        } else {
            if (numberOfEdibles >= 1) {
                edibleObjects.subList(1, numberOfEdibles + 1).clear();
            }
        }
    }



}

