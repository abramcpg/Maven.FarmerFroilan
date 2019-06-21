package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.ChickenCoup;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

import java.util.List;

public class Farm { //Singleton
    List<Stable> stables;
    List<ChickenCoup> chickenCoops;
    List<FarmVehicle> farmVehicles;
    Field field;
    FarmHouse farmHouse; //probably defined as singleton cause there's only one

    public void addStable(){}

    public void addChickenCoup(){}

    public void addFarmVehicle(){}
}
