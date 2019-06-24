package com.zipcodewilmington.froilansfarm.StoreHouses;

import com.zipcodewilmington.froilansfarm.EdibleObjects.Carrot;
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
    private static final CarrotStoreHouse carrotStoreHouse = CarrotStoreHouse.getInstance();


    private Barn() {
    }

    public static Barn getInstance() {
        return INSTANCE;
    }

    public CarrotStoreHouse getCarrotStoreHouse() { return carrotStoreHouse; }

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
                if (edible instanceof EarCorn){
                    CornStoreHouse.getInstance().addEdibleObject((EarCorn) edible);
                } else if (edible instanceof Tomato){
                    TomatoStoreHouse.getInstance().addEdibleObject((Tomato) edible);
                } else if (edible instanceof Carrot){
                    CarrotStoreHouse.getInstance().addEdibleObject((Carrot) edible);
                } else {
                    EggStoreHouse.getInstance().addEdibleObject((Egg) edible);
                }
            }
        }
        //return cropList;
    }







}
