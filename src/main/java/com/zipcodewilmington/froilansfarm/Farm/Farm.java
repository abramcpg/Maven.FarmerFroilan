package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.ChickenCoup;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Person> people; //do we need this?? Farmhouse already includes a list of people
    List<Stable> stables;
    List<ChickenCoup> chickenCoops;
    List<FarmVehicle> farmVehicles;
    Field field;
    FarmHouse farmHouse; //probably defined as singleton cause there's only one

    public Farm() {
        this.people = new ArrayList<>();
        this.stables = new ArrayList<>();
        this.chickenCoops = new ArrayList<>();
        this.farmVehicles = new ArrayList<>();
        this.field = new Field();
        this.farmHouse = new FarmHouse();

    }




    public void addStable(){}

    public void addChickenCoup(){}

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
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
}
