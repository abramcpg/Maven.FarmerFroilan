package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.ChickenCoup;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.FroilanFarm.FroilanFarm;
import com.zipcodewilmington.froilansfarm.Farm.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;
import com.zipcodewilmington.froilansfarm.Farm.DayOfWeek;
import com.zipcodewilmington.froilansfarm.Farm.FroilanFarm.FarmWeek;
import com.zipcodewilmington.froilansfarm.StoreHouses.CornStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.EggStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.TomatoStoreHouse;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.Scanner;

import static java.lang.System.*;

public class FarmTour {


    private FroilanFarm froilanFarm = FroilanFarm.getInstance();
    private FarmWeek week = new FarmWeek();

    //Tour variables
    private String day;
    private Scanner input;
    private String setTourMessage;
    private String tour;
    private DayOfWeek tourDay;
    private FarmWeek farmWeek;
    private String tourOptions;
    private String tour1;
    private String tour2;
    private String tour3;
    private String tour4;
    private String tour5;

    //Noises for tour1
    Chicken chicken = new Chicken();
    String chickenNoise = chicken.makeNoise();
    Horse horse = new Horse();
    String horsenoise = horse.makeNoise();
    Tractor tractor = new Tractor();
    String tractorNoise = tractor.makeNoise();
    Farmer farmer = new Farmer();
    String farmerNoise = farmer.makeNoise();
    CropDuster cropDuster = new CropDuster();
    String cropDusterNoise = cropDuster.makeNoise();
    Pilot pilot = new Pilot();
    String pilotNoise = pilot.makeNoise();

    //Storehouse variables
    private Farm froilanFarm1 = Farm.getInstance(); //froilanFarm already used. thus the 1 on the end
    private CornStoreHouse cornStoreHouse = froilanFarm1.getBarn().getCornStoreHouse();
    private TomatoStoreHouse tomatoStoreHouse = froilanFarm1.getBarn().getTomatoStoreHouse();
    private EggStoreHouse eggStoreHouse = froilanFarm1.getBarn().getEggStoreHouse();
    private CornStalk cornStalk = new CornStalk();
    private TomatoPlant tomatoPlant = new TomatoPlant();

    //StoreHouse displays for tour2
    Integer cornDisplay = cornStoreHouse.getAmountInStorage();
    Integer tomatoDisplay = tomatoStoreHouse.getAmountInStorage();
    Integer eggDisplay = eggStoreHouse.getAmountInStorage();

public FarmTour() {
    this.tourOptions = String.format(
            "\t1. Enjoy the sounds of the farm\n" +
                    "\t2. Visit the food store houses\n" +
                    "\t3. Enjoy the smells of the farm\n");
                    //"\t4. Do a tax audit!\n" +
                    //"\t5. Ride our horses");
     this.day = "Sunday";
     this.input = new Scanner(System.in);
     this.setTourMessage = String.format(
            "Oh right! I've been doing so much coding, my days are running together.\n" +
                    "What would you like to see from the options below?\n" + tourOptions);
    this.tour = "1";
    this.tour1 = String.format(
            "Oh all the sounds of the farm! I'll have Froilanda start up the plane so \n" +
                    "you can see that in action while I take you around on the tractor" +
                    "\nChickens: " + chickenNoise +
                    "\nHorses: " + horsenoise +
                    "\nTractor: " + tractorNoise +
                    "\nFarmer: " + farmerNoise +
                    "\nCrop Duster: " + cropDusterNoise +
                    "\nPilot: " + pilotNoise +
                    "\nAnything else ya'll wanna see?\n" + tourOptions);

   this.tour2 = String.format(
           "Here we have all the food we make here on Froilan's farm.\n" +
                   "Corn Store House: " + cornDisplay +
                   "\nTomato Store House: " +tomatoDisplay +
                   "\nEgg Store House: " + eggDisplay +
                   "\nAnything else ya'll wanna see?\n" + tourOptions);

   this.tour3 = String.format("Smells like shit. * you leave a negative Yelp review *");
   this.tour4 = String.format("");
   this.tour5 = String.format("");

    froilanFarm.setUp();
}


        public void init () {
            setDay();
            //tourDay = new DayOfWeek(day);
            tourDay = DayOfWeek.valueOf(day.toUpperCase());//DayOfWeek.valueOf(day.toUpperCase()); //sets tourDay to object of DayOfWeek
            week.week(tourDay); //Runs the week up to the selected day
            setTour();
            callTour();

        }

        public void setDay () {
            //Scanner input = new Scanner(System.in); //Create scanner object
            out.println("Welcome to Froilan's Farm!\nDo you happen to know what day it is?");
            day = input.nextLine();
            out.println(setTourMessage);
        }

        public void setTour () {
            //Message sent from setDay or one of the tours
            tour = input.nextLine();
            callTour();
        }

        public void callTour () {
            switch (tour) {
                case "1":
                    out.println(tour1);
                    setTour();
                    break;
                case "2":
                    out.println(tour2);
                    setTour();
                    break;
                case "3":
                    out.println(tour3);
                    setTour();
                    callTour();
                    break;
                case "4":
                    out.println(tour4);
                    setTour();
                    break;
                case "5":
                    out.println(tour5);
                    setTour();
                    break;
            }
        }
}
