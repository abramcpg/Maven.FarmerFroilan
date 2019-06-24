package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.ChickenCoup;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;

import java.util.Scanner;

import static java.lang.System.*;

public class FarmTour {

    private String day = "Sunday";
    private String time = "Sunrise";
    private Scanner input = new Scanner(System.in);
    private String setTourMessage = String.format(
            "Howdy! It's % at %. What would you like to see from the options on our pamphlet?\n" +
            "\t1. Enjoy the sounds of the farm\n" +
            "\t2. Visit the food store houses\n" +
            "\t3. Check out our animals\n" +
            "\t4. Do a tax audit!\n" +
            "\t5. Ride our horses");
    String tour = "1";

    public void init(){
        setDay();
        setTime();
        setTour();
        //tour
    }






    public void setDay(){
        //Scanner input = new Scanner(System.in); //Create scanner object
        out.println("Welcome to Froilan's Farm Tour Center!\nWhat day would you like to visit?");
        day = input.nextLine();
    }

    public void setTime(){
        out.println("Okay, we have sunrise and sunset tours on " + day + ".\nWhich do you prefer?");
        time = input.nextLine();
        out.println("So " + day + " for the " + time + " tour.\n See you there!");
    }

    public void setTour(){
        out.println(setTourMessage);
        tour = input.nextLine();
    }





}
