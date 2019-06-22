package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EdibleObjectTest {

    private Farm froilanFarm = Farm.getInstance();
    private Farmer froilan = new Farmer("Froilan");
    private ArrayList<EarCorn> cornList = new ArrayList<>();


    @Before
    public void setUp() {
        cornList.add(new EarCorn());
        cornList.add(new EarCorn());
        cornList.add(new EarCorn());
        cornList.add(new EarCorn());
        cornList.add(new EarCorn());
        froilanFarm.getBarn().getCornStoreHouse().addEdibleObjects(cornList);
    }

    @Test
    public void cornTest() {
        //When
        EarCorn earCorn = new EarCorn();
        //Then
        assertTrue(earCorn instanceof EarCorn);
    }


     @Test
        public void tomatoTest() {
            //When
            Tomato tomato = new Tomato();
            //Then
            assertTrue(tomato instanceof Tomato);
        }

    @Test
    public void edibleEggTest() {
        //Given
        int numberOfChickens = 15;
        Egg egg = new Egg();
        //Then
        egg.getDailyEggs(numberOfChickens);
        int expected = Math.round((numberOfChickens +1) / 2);
        int actual = egg.getDailyEggs(numberOfChickens);
        //assert
        assertEquals(expected, actual);
   }

}
