package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;

public class CornStalk extends Crop {


    public CornStalk() {}


    public EarCorn Yield() {
        if (this.getHasBeenHarvested().equals(false) && this.getHasBeenFertilized().equals(true)){
            return new EarCorn();
        }
        //addToStoreHouse(new EarCorn());
        return null;
    }


    public void addToStoreHouse(EarCorn earcorn){
        Barn.getInstance().getCornStoreHouse().addEdibleObject(earcorn);
    }


    public Class getCropType(){
        return this.getClass();
    }
}
