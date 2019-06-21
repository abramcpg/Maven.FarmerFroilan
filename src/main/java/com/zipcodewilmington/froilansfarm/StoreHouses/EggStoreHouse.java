package com.zipcodewilmington.froilansfarm.StoreHouses;

import com.zipcodewilmington.froilansfarm.Crops.Egg;

import java.util.List;

public class EggStoreHouse extends StoreHouse<Egg> {

    private static final EggStoreHouse INSTANCE = new EggStoreHouse();


    public EggStoreHouse() {
        super();
    }

    public EggStoreHouse(List<Egg> edibleObjects) {
        super(edibleObjects);
    }

    public static EggStoreHouse getInstance() {
        return INSTANCE;
    }
}
