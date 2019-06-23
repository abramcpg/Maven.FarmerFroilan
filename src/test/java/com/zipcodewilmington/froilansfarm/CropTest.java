package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;
import com.zipcodewilmington.froilansfarm.StoreHouses.CornStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.TomatoStoreHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CropTest {
    //should make some of these singletons asap
    private Farm froilanFarm;
    private CropRow<CornStalk> cornRow1;
    private CropRow<TomatoPlant> tomatoRow1;
    private CropRow<CornStalk> cornRow2;
    private CropRow<Crop> genericRow;
    private Field thisField = new Field();
    private ArrayList<CropRow> rows;
    private FarmHouse farmHouse;

    @Before
    public void setUp() {
        froilanFarm = Farm.getInstance();
        cornRow1 = new CropRow<>();
        cornRow2 = new CropRow<>();
        tomatoRow1 = new CropRow<>();
        genericRow = new CropRow<>();
        rows = new ArrayList<>();
        farmHouse = FarmHouse.getInstance();
        froilanFarm.setFarmHouse(farmHouse);
        froilanFarm.setField(thisField);
        froilanFarm.getField().setCropRows(rows);
    }

//    @Test
//    public void yieldEarCornTest(){
//        Crop crop = new Crop();
//        //When
//        Edible actual = crop.yield();
//        //Then
//        assertTrue(actual instanceof EarCorn);
//    }

//    @Test
//    public void tomatoPlantIsEdibleTest(){
//        TomatoPlant tomatoPlant = new TomatoPlant();
//        assertTrue(tomatoPlant instanceof EdibleObject);
//    }



}
