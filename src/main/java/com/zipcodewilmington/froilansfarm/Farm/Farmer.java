package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.*;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Farmer extends Person implements Botanist, Rider {


    public Farmer() {
        super();
    }

    public Farmer(String name) {
        super(name);
    }


    public String makeNoise() {

        return "Dang nabbit!";
    }

    public void plant(Crop crop) {

    }


    public void plantRow(Crop crop, CropRow<?> cropRow, Integer amount) {
        cropRow.addMultipleToCropRow(crop, amount);
    }


    public ArrayList<EdibleObject> getEggs(){
        ArrayList<EdibleObject> eggs = new ArrayList<>();
        for (ChickenCoup chickenCoup : Farm.getInstance().getChickenCoops()) {
            eggs.addAll(chickenCoup.getEggs());
        }
        Barn.getInstance().addToStorage(eggs);
        return eggs;
    }


    public void feedAnimal(Animal animal, EdibleObject edible, Integer amount){
        animal.eat(edible, amount);
    }

    public void feedHorses(EdibleObject edible, Integer amount){
        for (Stable stable : Farm.getInstance().getStables()){
            for (Horse horse : stable.getHorses()){
                feedAnimal(horse, edible, amount);
                horse.setHasBeenFed(true);
            }
        }
    }

    public void feedChickens(EdibleObject edible, Integer amount){
        for (ChickenCoup coup : Farm.getInstance().getChickenCoops()){
            for (Chicken chicken : coup.getChickens()){
                feedAnimal(chicken, edible, amount);
                chicken.setHasBeenFed(true);
            }
        }
    }



    public ArrayList<EdibleObject> pilot(Tractor tractor) {
        ArrayList<EdibleObject> harvested = tractor.operate();
        Farm.getInstance().getField().setHasBeenFertilized(false);
        Farm.getInstance().getField().setHasBeenHarvested(true);
        return harvested;
    }

    public void mount(Rideable rideable) {
        rideable.isBeingRidden();

    }

    public void dismount(Rideable rideable) {
        rideable.stopRiding();

    }

    public void ride(Rideable rideable) {
        rideable.hasBeenRidden();
    }

    public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {
        super.eat(edibleObject, numberOfEdibles);
    }
}
