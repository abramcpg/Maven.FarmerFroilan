package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoup {
    private List<Chicken> chickens;

    public ChickenCoup() {
        this.chickens = new ArrayList<>();
    }


    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public ArrayList<EdibleObject> getEggs(){
        ArrayList<EdibleObject> eggs = new ArrayList<>();
        for (Chicken chicken : chickens){
            eggs.add(chicken.Yield());
        }
        return eggs;
    }

}
