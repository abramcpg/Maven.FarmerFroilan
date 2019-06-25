package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.ChickenCoup;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.FroilanFarm.FroilanFarm;
import com.zipcodewilmington.froilansfarm.Farm.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;
import com.zipcodewilmington.froilansfarm.Farm.DayOfWeek;
import com.zipcodewilmington.froilansfarm.Farm.FroilanFarm.FarmWeek;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.Scanner;

import static java.lang.System.*;

public class FarmTour {


    private FroilanFarm froilanFarm = FroilanFarm.getInstance();
    private FarmWeek week = new FarmWeek();




    Chicken chicken = new Chicken();
    String chickenNoise = chicken.makeNoise();

    private String day;
    private Scanner input;
    private String setTourMessage;
    private String tour;
    private DayOfWeek tourDay;
    private FarmWeek farmWeek;
    private String tour1;

    private String tour2;

public FarmTour() {
     this.day = "Sunday";
     this.input = new Scanner(System.in);
     this.setTourMessage = String.format(
            "Oh right! I've been doing so much coding, my days are running together.\n" +
                    "What would you like to see from the options below?\n" +
                    "\t1. Enjoy the sounds of the farm\n" +
                    "\t2. Visit the food store houses\n" +
                    "\t3. Check out our animals\n" +
                    "\t4. Do a tax audit!\n" +
                    "\t5. Ride our horses");
    this.tour = "1";
    this.tour1 = String.format(
            "Oh all the sounds of the farm! I'll have Froilana start up the plane so " +
                    "you can see that in action while I take you around on the tractor" +
                    "Chickens: " + chickenNoise +
                    "Horses: " +
                    "Tractor: " +
                    "Farmer: " +
                    "Crop Duster: " +
                    "Pilot: " +
                    "Anything else ya'll wanna see?" +
                    "\t1. Enjoy the sounds of the farm\n" +
                    "\t2. Visit the food store houses\n" +
                    "\t3. Check out our animals\n" +
                    "\t4. Do a tax audit!\n" +
                    "\t5. Ride our horses");

   this.tour2 = String.format("");

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
        }

        public void callTour () {
            switch (tour) {
                case "1":
                    out.println(tour1);
                    setTour();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
            }
        }
}
