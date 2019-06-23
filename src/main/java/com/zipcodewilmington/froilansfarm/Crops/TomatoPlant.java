package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;

//in a 100' row, there are 50 tomato plants
//each plant yields 10 tomatoes
public class TomatoPlant extends Crop {


    public TomatoPlant() {
        super();
    }


   public Tomato Yield() {
        if (this.getHasBeenHarvested().equals(false) && this.getHasBeenFertilized().equals(true)) {
            return new Tomato();
        }
        return null;
    }

    public int getHarvestedTomatoes(int numberOfPlants, int tomatoesPerPlant){  //int is number of tomato plants
        int edibleCount =0 ;
            edibleCount = numberOfPlants * tomatoesPerPlant;
        return edibleCount;
    }


}
