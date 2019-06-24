package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.ChickenCoup;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;
import com.zipcodewilmington.froilansfarm.Farm.DayOfWeek;
import com.zipcodewilmington.froilansfarm.Farm.FroilanFarm.FarmWeek;

import java.util.Scanner;

import static java.lang.System.*;

public class FarmTour {

    private String day = "Sunday";
    private Scanner input = new Scanner(System.in);
    private String setTourMessage = String.format(
            "Oh right! I've been doing so much coding, my days are running together.\n" +
                    "What would you like to see from the options below?\n" +
            "\t1. Enjoy the sounds of the farm\n" +
            "\t2. Visit the food store houses\n" +
            "\t3. Check out our animals\n" +
            "\t4. Do a tax audit!\n" +
            "\t5. Ride our horses");
    private String tour = "1";


    public void init(){
        setDay();
        DayOfWeek.valueOf(day);
        setTour();
        //callTour

    }

    public void setDay(){
        //Scanner input = new Scanner(System.in); //Create scanner object
        out.println("Welcome to Froilan's Farm!\nDo you happen to know what day it is?");
        day = input.nextLine();
    }

    public void setTour(){
        out.println(setTourMessage);
        tour = input.nextLine();
    }

    public void callTour(){
        switch (tour){
            case "1":
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
