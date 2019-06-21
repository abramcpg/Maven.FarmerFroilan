package com.zipcodewilmington.froilansfarm.StoreHouses;

public class Barn {

    private static final Barn INSTANCE = new Barn();

    private static final EggStoreHouse eggStoreHouse = EggStoreHouse.getInstance();
    private static final TomatoStoreHouse tomatoStoreHouse = TomatoStoreHouse.getInstance();
    private static final CornStoreHouse cornStoreHouse = CornStoreHouse.getInstance();


    private Barn() {
    }

    public static Barn getInstance() {
        return INSTANCE;
    }

    public EggStoreHouse getEggStoreHouse() {
        return eggStoreHouse;
    }

    public TomatoStoreHouse getTomatoStoreHouse() {
        return tomatoStoreHouse;
    }

    public CornStoreHouse getCornStoreHouse() {
        return cornStoreHouse;
    }
}
