package com.zipcodewilmington.froilansfarm.StoreHouses;

import com.zipcodewilmington.froilansfarm.Crops.EarCorn;

import java.util.List;

public class CornStoreHouse extends StoreHouse<EarCorn> {

    private static final CornStoreHouse INSTANCE = new CornStoreHouse();


    private CornStoreHouse() {
        super();
    }

    public CornStoreHouse(List<EarCorn> edibleObjects) {
        super(edibleObjects);
    }

    public static CornStoreHouse getInstance() {
        return INSTANCE;
    }
}
