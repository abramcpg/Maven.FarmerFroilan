package com.zipcodewilmington.froilansfarm.StoreHouses;

import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;

import java.util.List;

public class TomatoStoreHouse extends StoreHouse<Tomato> {

    private static final TomatoStoreHouse INSTANCE = new TomatoStoreHouse();


    public TomatoStoreHouse() {
        super();
    }

    public TomatoStoreHouse(List<Tomato> edibleObjects) {
        super(edibleObjects);
    }

    public static TomatoStoreHouse getInstance() {
        return INSTANCE;
    }
}
