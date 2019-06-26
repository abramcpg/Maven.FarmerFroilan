package com.zipcodewilmington.froilansfarm;

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

import java.util.InputMismatchException;
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
                   "Corn Store House: " + froilanFarm.getFarm().getBarn().getCornStoreHouse().getAmountInStorage() +
                   "\nTomato Store House: " +tomatoDisplay +
                   "\nEgg Store House: " + eggDisplay +
                   "\nAnything else ya'll wanna see?\n" + tourOptions);

   this.tour3 = String.format("Smells like shit. * you leave a negative Yelp review *");
   this.tour4 = String.format("");
   this.tour5 = String.format("");

    froilanFarm.setUp();
}


    public void getFood() {
        out.println("\nHere we have all the food we make here on Froilan's farm.");
        String storehouses = ("=========================\n" +
                "Corn Store House: " + froilanFarm.getFarm().getBarn().getCornStoreHouse().getAmountInStorage() +
                "\nTomato Store House: " + froilanFarm.getFarm().getBarn().getTomatoStoreHouse().getAmountInStorage() +
                "\nEgg Store House: " + froilanFarm.getFarm().getBarn().getEggStoreHouse().getAmountInStorage() +
                "\nCarrot Store House: " + froilanFarm.getFarm().getBarn().getCarrotStoreHouse().getAmountInStorage()
                + "\n=========================\n");
        out.println(storehouses);


        String food;
        Integer num;

        while (true) {
            out.println("Yer lookin' mighty hungry, ya'll want summin' ta eat?");
            food = input.nextLine().toLowerCase();
            if (food.equals("yes") || food.equals("no")) {
                break;
            } else {
                out.println("Heh?");
            }
        }
        if (food.equalsIgnoreCase("yes")) {
            out.println("What can I getchya?");
            food = input.nextLine().toLowerCase();

            while (true) {
                out.println("How many ya want?");
                try {
                    num = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    out.println("Well I ain't so good at math, but I'm dang sure that ain't no number...");
                    num = 1;
                    break;
                }
            }
            Farmer person = new Farmer();
            switch (food) {
                case "corn":
                    person.eat(new EarCorn(), num);
                    break;
                case "tomato":
                    person.eat(new Tomato(), num);
                    break;
                case "egg":
                    person.eat(new Egg(), num);
                    break;
                case "carrot":
                    person.eat(new Carrot(), num);
                default:
                    break;
            }
        }
        if (froilanFarm.getFarm().getBarn().getCornStoreHouse().getAmountInStorage() + froilanFarm.getFarm().getBarn().getTomatoStoreHouse().getAmountInStorage() + froilanFarm.getFarm().getBarn().getEggStoreHouse().getAmountInStorage() + froilanFarm.getFarm().getBarn().getCarrotStoreHouse().getAmountInStorage()
                == 0) {
            out.println("\n\n\n\n\n\nYA'LL ATE ALL OF MY DAMN PRODUCE! GET THE HELL OFF MY FARM, DAMMIT!!!");
            System.exit(0);
        } else {
            out.println("\nAnything else ya'll wanna see?\n" + tourOptions);
            setTour();
        }
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
            tour = "";
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
                    //out.println(tour2);
                    getFood();
                    setTour();
                    break;
                case "3":
                    out.println(tour3);
                    setTour();
                    //callTour();
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
