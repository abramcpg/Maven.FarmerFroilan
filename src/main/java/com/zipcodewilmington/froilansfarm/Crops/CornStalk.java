package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;

public class CornStalk extends Crop {


    public CornStalk() {}



    public EarCorn Yield() {

        return new EarCorn();
    }
}
