package com.zipcodewilmington.froilansfarm.StoreHouses;

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
}

