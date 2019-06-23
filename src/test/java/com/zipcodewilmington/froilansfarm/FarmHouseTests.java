package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.Person;
import com.zipcodewilmington.froilansfarm.Farm.Pilot;
import org.junit.Test;

import java.util.ArrayList;

public class FarmHouseTests {

    private FarmHouse farmHouse = FarmHouse.getInstance();
    private Farmer froilan = new Farmer("Froilan");
    private Pilot froilanda = new Pilot("Froilanda");
    private ArrayList<Person> personList = new ArrayList<>();




    @Test
    public void test1(){
        personList.add(froilan);

    }


}
