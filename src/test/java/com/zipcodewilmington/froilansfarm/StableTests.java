package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Stable;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StableTests {


    @Test
    public void addHorseTest() {
        //Given
        Stable stable = new Stable(); //Had to create stable object vs calling Stable class, to avoid static issues

        ArrayList<Horse> expected = new ArrayList<>();
        Horse horse1 = null;
        Horse horse2 = null;
        Horse horse3 = null;
        expected.add(horse1);
        expected.add(horse2);
        expected.add(horse3);

        //When
        stable.addHorse(horse1);
        stable.addHorse(horse2);
        stable.addHorse(horse3);

        //Then
        Assert.assertEquals(expected, stable.getHorses());
    }

 /*   @Test
    public void removeHorseTest(){
        //Given
        Stable stable = new Stable();
        ArrayList<Horse> expected = new ArrayList<>();
        Horse horse1 = null;
        Horse horse2 = null;
        Horse horse3 = null;
        expected.add(horse1); //only add Horse1 and horse2 to expected
        expected.add(horse2);


        //When
        stable.addHorse(horse1); //add 3 Horses to actual
        stable.addHorse(horse2);
        stable.addHorse(horse3);

        stable.removeHorse(horse3);


        //Then
        Assert.assertEquals(expected, stable.getHorses() );
    }*/


    //No setHorses method
   /* @Test
    public void setHorsesTest(){
        //Given
        Stable stable = new Stable();
        ArrayList<Horse> expected = new ArrayList<>();
        Horse horse1 = null;
        Horse horse2 = null;
        Horse horse3 = null;
        expected.add(horse1);
        expected.add(horse2);
        expected.add(horse3);


        //When
        stable.setHorses(expected);

        //Then
        Assert.assertEquals(expected, stable.getHorses() );

    }*/

}
