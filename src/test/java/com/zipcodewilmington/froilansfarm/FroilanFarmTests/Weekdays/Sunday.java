package com.zipcodewilmington.froilansfarm.FroilanFarmTests.Weekdays;

import com.zipcodewilmington.froilansfarm.Farm.DayOfWeek;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.FroilanFarm.FarmWeek;
import com.zipcodewilmington.froilansfarm.Farm.FroilanFarm.FroilanFarm;
import org.junit.Before;
import org.junit.Test;

public class Sunday {

    private FroilanFarm froilanFarm = FroilanFarm.getInstance();
    private Farmer froilan = (Farmer) froilanFarm.getFarm().getFarmHouse().getPeople().get(0);
    private FarmWeek week = new FarmWeek();

    @Before
    public void setUp(){
        froilanFarm.setUp();
        week.week(DayOfWeek.SUNDAY);
    }

    @Test
    public void horseTest(){

    }


}
