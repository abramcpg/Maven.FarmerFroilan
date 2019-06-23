package com.zipcodewilmington.froilansfarm.StoreHouses;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;

import java.util.ArrayList;

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



    public void addToStorage(ArrayList<EdibleObject> edibles) {
        //ArrayList<Crop> newList = new ArrayList<>();
        for (EdibleObject edible : edibles) {
            if (edible != null) {
                if (edible.getClass().equals(new EarCorn().getClass())){
                    CornStoreHouse.getInstance().addEdibleObject((EarCorn) edible);
                } else if (edible.getClass().equals(new Tomato().getClass())){
                    TomatoStoreHouse.getInstance().addEdibleObject((Tomato) edible);
                } else {
                    EggStoreHouse.getInstance().addEdibleObject((Egg) edible);
                }
            }
        }
        //return cropList;
    }







}
