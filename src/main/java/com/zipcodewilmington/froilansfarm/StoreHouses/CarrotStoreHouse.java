package com.zipcodewilmington.froilansfarm.StoreHouses;

import com.zipcodewilmington.froilansfarm.EdibleObjects.Carrot;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;

import java.util.List;

public class CarrotStoreHouse extends StoreHouse<Carrot> {


    private static final CarrotStoreHouse INSTANCE = new CarrotStoreHouse();


    public CarrotStoreHouse() {
        super();
    }

    public CarrotStoreHouse(List<Carrot> edibleObjects) {
        super(edibleObjects);
    }

    public static CarrotStoreHouse getInstance() {
        return INSTANCE;
    }
}