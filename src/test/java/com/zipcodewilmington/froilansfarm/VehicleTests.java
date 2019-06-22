package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;
import com.zipcodewilmington.froilansfarm.StoreHouses.CornStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.TomatoStoreHouse;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class VehicleTests {

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

    //******************************************
    // CropDuster Tests

@Test
   public void testCropDusterIsAircraft() {

    CropDuster cropDuster = new CropDuster();
    String exp = "Neeeewwrrrgghh";
    String act = cropDuster.makeNoise();
    Assert.assertEquals(act, exp);

    }


    @Test
    public void testCropDusterSetsFieldHasBeenFertilized() {

        Boolean act, exp;

        thisField.setHasBeenFertilized(false);
        act = thisField.getHasBeenFertilized();

        exp = true;
        thisField.setHasBeenFertilized(exp);
        act = thisField.getHasBeenFertilized();

        Assert.assertEquals(act, exp);

    }


    @Test
    public void testCropDusterGetsFieldHasBeenFertilized() {

        Boolean act, exp;

        thisField.setHasBeenFertilized(false);
        act = thisField.getHasBeenFertilized();

        exp = true;
        thisField.setHasBeenFertilized(exp);
        act = thisField.getHasBeenFertilized();

        Assert.assertEquals(act, exp);

    }



    //******************************************
    // Tractor Tests

    @Test
    public void testTractorIsVehicle() {

        Tractor tractor = new Tractor();
        String exp = "Vrooom";
        String act = tractor.makeNoise();
        Assert.assertEquals(act, exp);

    }


    @Test
    public void testTractorIsRideable() {

        Boolean act, exp;

        thisField.setHasBeenFertilized(false);
        act = thisField.getHasBeenFertilized();

        exp = true;
        thisField.setHasBeenFertilized(exp);
        act = thisField.getHasBeenFertilized();

        Assert.assertEquals(act, exp);

    }


    @Test
    public void testTractorFieldFertilized() {

        Boolean act, exp;

        exp = true;
        thisField.setHasBeenFertilized(exp);
        act = thisField.getHasBeenFertilized();

        exp = false;
        thisField.setHasBeenFertilized(exp);
        act = thisField.getHasBeenFertilized();

        Assert.assertEquals(act, exp);

    }



}
