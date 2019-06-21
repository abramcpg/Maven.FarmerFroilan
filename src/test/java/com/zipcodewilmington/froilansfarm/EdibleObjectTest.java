package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import org.junit.Test;
import org.junit.Test;

import static org.junit.Assert.*;

public class EdibleObjectTest {

    @Test
    public void createEarCornTest() {
        //When
        EarCorn earCorn = new EarCorn();
        //Then
        assertTrue(earCorn instanceof EarCorn);
    }


    @Test
    public void tomatoIsEdibleTest(){
        Tomato tomato = new Tomato();
        assertTrue(tomato instanceof EdibleObject);
    }

}
