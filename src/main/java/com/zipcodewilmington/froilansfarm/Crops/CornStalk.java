package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;

public class CornStalk extends Crop {


    public EdibleObject Yield() {

        return new EarCorn();
    }
}
