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
import com.zipcodewilmington.froilansfarm.Farm.DayOfWeek;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.ArrayList;

public class FarmWeek {
    FroilanFarm farm = FroilanFarm.getInstance();
    Farmer froilan = (Farmer) farm.getFarm().getFarmHouse().getPeople().get(0);
    Pilot froilanda = (Pilot) farm.getFarm().getFarmHouse().getPeople().get(1);
    CropRow<CornStalk> row1 = farm.getCropRow(0);
    CropRow<TomatoPlant> row2 = farm.getCropRow(1);
    CropRow<Crop> row3 = farm.getCropRow(2);
    CropRow<Crop> row4 = farm.getCropRow(3);
    CropRow<Crop> row5 = farm.getCropRow(4);
    CropDuster duster = (CropDuster) farm.getFarm().getFarmVehicles().get(1);
    Tractor tractor = (Tractor) farm.getFarm().getFarmVehicles().get(0);




    public void day1(){
        newDay();
        morningRoutine();
        ArrayList<CropRow> rows = new ArrayList<>();
        froilan.plantRow(new CornStalk(), row1, 100);
        froilan.plantRow(new TomatoPlant(), row2, 100);
        froilan.plantRow(new CarrotPlant(), row3, 100);

        froilan.plantRow(new CornStalk(), row4, 50);
        froilan.plantRow(new TomatoPlant(), row4, 50);

        froilan.plantRow(new CarrotPlant(), row5, 50);
        froilan.plantRow(new CornStalk(), row5, 25);
        froilan.plantRow(new TomatoPlant(), row5, 25);
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        rows.add(row5);
        farm.getFarm().getField().setCropRows(rows);

        dinner();
    }

    public void day2(){
        newDay();
        morningRoutine();
        froilanda.pilot(duster);
        dinner();
    }

    public void day3(){
        newDay();
        morningRoutine();
        froilan.pilot(tractor);
        dinner();
    }



    public void week(DayOfWeek day){
        String switcher = day.getDayName();
        switch (switcher) {
            case "Sunday":
                day1();
                break;
            case "Monday":
                day1();
                day2();
                break;
            case "Tuesday":
                day1();
                day2();
                day3();
                break;
            case "Wednesday":
                day1();
                day2();
                day3();
                day2();
                break;
            case "Thursday":
                day1();
                day2();
                day3();
                day2();
                day3();
                break;
            case "Friday":
                day1();
                day2();
                day3();
                day2();
                day3();
                day2();
                break;
            case "Saturday":
                day1();
                day2();
                day3();
                day2();
                day3();
                day2();
                day3();
                break;
        }
    }






    public void morningRoutine(){
        rideHorses();
        froilan.feedHorses(new Carrot(), 3);
        froilan.feedChickens(new EarCorn(), 1);
        froilan.getEggs();

        froilan.eat(new EarCorn(), 1);
        froilan.eat(new Tomato(), 2);
        froilan.eat(new Egg(), 5);

        froilanda.eat(new EarCorn(), 2);
        froilanda.eat(new Tomato(), 1);
        froilanda.eat(new Egg(), 2);
    }


    public void dinner(){

        froilan.eat(new EarCorn(), 2);
        froilan.eat(new Tomato(), 2);
        froilan.eat(new Carrot(), 2);

        froilanda.eat(new EarCorn(), 2);
        froilanda.eat(new Tomato(), 2);
        froilanda.eat(new Carrot(), 2);
    }





    public void rideHorses(){
        for (Horse horse : farm.getFarm().getStables().get(0).getHorses()){
            froilan.ride(horse);
        }
        for (Horse horse : farm.getFarm().getStables().get(1).getHorses()){
            froilanda.ride(horse);
        }
        for (Horse horse : farm.getFarm().getStables().get(2).getHorses()){
            froilan.ride(horse);
        }
    }


    public void newDay() {
        for (Stable stable : Farm.getInstance().getStables()) {
            for (Horse horse : stable.getHorses()) {
                horse.setHasBeenFed(false);
                horse.setHasBeenRiddenToday(false);
            }
        }

        for (ChickenCoup coup : Farm.getInstance().getChickenCoops()) {
            for (Chicken chicken : coup.getChickens()) {
                chicken.setHasBeenFed(false);
            }
        }
    }




}
