package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdibleObjects.Carrot;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;

public class CarrotPlant extends Crop {


    public CarrotPlant() {
        super();
    }


    public Carrot Yield() {
        if (this.getHasBeenHarvested().equals(false) && this.getHasBeenFertilized().equals(true)) {
            return new Carrot();
        }
        return null;
    }


    public void addToStoreHouse(Carrot carrot) {
        Barn.getInstance().getCarrotStoreHouse().addEdibleObject(carrot);
    }


    public Class getCropType() {
        return this.getClass();
    }
}
