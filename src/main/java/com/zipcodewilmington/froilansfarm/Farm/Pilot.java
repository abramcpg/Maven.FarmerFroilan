package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Farm.Person;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;

public class Pilot extends Person implements Rider {


    public Pilot() {
        super();
    }

    public Pilot(String name) {
        super(name);
    }

    public void pilot(CropDuster cropDuster){
        cropDuster.fertilize(Farm.getInstance().getField());
    }


    public String makeNoise() {
        return null;
    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    public void ride(Rideable rideable) {

    }

    public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {
        super.eat(edibleObject, numberOfEdibles);
    }
}
