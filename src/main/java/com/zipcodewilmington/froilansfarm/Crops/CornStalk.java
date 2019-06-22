package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;

public class CornStalk extends Crop {


    public CornStalk() {}



    public EarCorn Yield() {

        //addToStoreHouse(new EarCorn());
        return new EarCorn();
    }


    public void addToStoreHouse(EarCorn earcorn){
        Barn.getInstance().getCornStoreHouse().addEdibleObject(earcorn);
    }

}
