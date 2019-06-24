package com.zipcodewilmington.froilansfarm.Farm.FroilanFarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.ChickenCoup;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Carrot;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.Person;
import com.zipcodewilmington.froilansfarm.Farm.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.ArrayList;

public class FroilanFarm {

    private static final FroilanFarm INSTANCE = new FroilanFarm();
    private Farm farm;


    private FroilanFarm() {
        this.farm = Farm.getInstance();
        setUp();
    }

    public static FroilanFarm getInstance() {
        return INSTANCE;
    }


    public void setUpCropRows() {
        ArrayList<CropRow> rows = new ArrayList<>();
        CropRow<CornStalk> row1 = new CropRow<>();
        CropRow<TomatoPlant> row2 = new CropRow<>();
        CropRow<Crop> row3 = new CropRow<>();
        CropRow<Crop> row4 = new CropRow<>();
        CropRow<Crop> row5 = new CropRow<>();
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        rows.add(row5);

        farm.getField().setCropRows(rows);
    }

    public void setUpCoups(){
        ArrayList<ChickenCoup> coups = new ArrayList<>();
        ChickenCoup coup1 = new ChickenCoup();
        ChickenCoup coup2 = new ChickenCoup();
        ChickenCoup coup3 = new ChickenCoup();
        ChickenCoup coup4 = new ChickenCoup();

        coup1.addChicken(new Chicken());
        coup1.addChicken(new Chicken());
        coup1.addChicken(new Chicken());
        coup1.addChicken(new Chicken());
        coup1.addChicken(new Chicken());

        coup2.addChicken(new Chicken());
        coup2.addChicken(new Chicken());
        coup2.addChicken(new Chicken());
        coup2.addChicken(new Chicken());
        coup2.addChicken(new Chicken());

        coup3.addChicken(new Chicken());
        coup3.addChicken(new Chicken());
        coup3.addChicken(new Chicken());

        coup4.addChicken(new Chicken());
        coup4.addChicken(new Chicken());

        coups.add(coup1);
        coups.add(coup2);
        coups.add(coup3);
        coups.add(coup4);
        farm.setChickenCoops(coups);
    }

    public void setUpStables(){
        ArrayList<Stable> stables = new ArrayList<>();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        stable1.addHorse(new Horse());
        stable1.addHorse(new Horse());
        stable1.addHorse(new Horse());
        stable1.addHorse(new Horse());

        stable2.addHorse(new Horse());
        stable2.addHorse(new Horse());
        stable2.addHorse(new Horse());

        stable3.addHorse(new Horse());
        stable3.addHorse(new Horse());
        stable3.addHorse(new Horse());

        stables.add(stable1);
        stables.add(stable2);
        stables.add(stable3);
        farm.setStables(stables);
    }

    public void setUpPeople(){
        ArrayList<Person> people = new ArrayList<>();
        Farmer froilan = new Farmer("Froilan");
        Pilot froilanda = new Pilot("Froilanda");
        people.add(froilan);
        people.add(froilanda);
        Farm.getInstance().getFarmHouse().setPeople(people);
    }

    public void stockStorehouses(){
        ArrayList<EdibleObject> food = new ArrayList<>();
        for (int i = 0; i < 300; i++){
            food.add(new Carrot());
            food.add(new Egg());
            food.add(new Tomato());
            food.add(new EarCorn());
        }
        farm.getBarn().addToStorage(food);
    }

    public void setUpVehicles(){
        ArrayList<FarmVehicle> vehicles = new ArrayList<>();
        vehicles.add(new Tractor());
        vehicles.add(new CropDuster());
        farm.setFarmVehicles(vehicles);
    }


    public void setUp(){
        farm.getBarn().getCarrotStoreHouse().clearStorehouse();
        farm.getBarn().getCornStoreHouse().clearStorehouse();
        farm.getBarn().getEggStoreHouse().clearStorehouse();
        farm.getBarn().getTomatoStoreHouse().clearStorehouse();
        //farm.setField(new Field());
        farm.setFarmVehicles(new ArrayList<>());
        farm.getFarmHouse().setPeople(new ArrayList<>());
        farm.setChickenCoops(new ArrayList<>());
        farm.setStables(new ArrayList<>());




        setUpCoups();
        setUpCropRows();
        setUpPeople();
        setUpStables();
        setUpVehicles();
        stockStorehouses();
    }


    public CropRow getCropRow(Integer index){
        return farm.getField().getCropRows().get(index);
    }



    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }
}
