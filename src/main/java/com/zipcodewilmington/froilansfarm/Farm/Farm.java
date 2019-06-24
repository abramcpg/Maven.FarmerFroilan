package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.ChickenCoup;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private static final Farm INSTANCE = new Farm();

    private List<Stable> stables;
    private List<ChickenCoup> chickenCoops;
    private List<FarmVehicle> farmVehicles;
    private Field field;
    private FarmHouse farmHouse; //probably defined as singleton cause there's only one
    private Barn barn;


    private Farm() {
        this.stables = new ArrayList<>();
        this.chickenCoops = new ArrayList<>();
        this.farmVehicles = new ArrayList<>();
        this.field = new Field();
        this.farmHouse = FarmHouse.getInstance();
        this.barn = Barn.getInstance();
    }


    public static Farm getInstance() {
        return INSTANCE;
    }


    public void addStable(Stable stable) {
        stables.add(stable);
    }

    public void addChickenCoup(ChickenCoup chickenCoup) {
        chickenCoops.add(chickenCoup);
    }


    public List<Stable> getStables() {
        return stables;
    }

    public void setStables(List<Stable> stables) {
        this.stables = stables;
    }

    public List<ChickenCoup> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(List<ChickenCoup> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public List<FarmVehicle> getFarmVehicles() {
        return farmVehicles;
    }

    public void setFarmVehicles(List<FarmVehicle> farmVehicles) {
        this.farmVehicles = farmVehicles;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public Barn getBarn() {
        return barn;
    }


}
