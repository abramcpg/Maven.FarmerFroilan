package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.EdibleObjects.Carrot;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CarrotTests {
    private CarrotPlant carrotPlant = new CarrotPlant();
    private CornStalk cornStalk = new CornStalk();
    private ArrayList<Crop> row = new ArrayList<>();

    private CropRow cropRows = new CropRow();
    private Field thisField = new Field();

    @Before
    public void setUp() {
        row.add(carrotPlant);
        row.add(cornStalk);
        row.add(carrotPlant);
        cropRows.setCrops(row);
        thisField.addCropRow(cropRows);
        thisField.addCropRow(cropRows);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void fertilizeTest() {
        Assert.assertFalse(carrotPlant.getHasBeenFertilized());
    }

    @Test
    public void fertilizeTest2() {
        carrotPlant.setHasBeenFertilized(true);
        Assert.assertTrue(carrotPlant.getHasBeenFertilized());
    }

    @Test
    public void harvestedTest() {
        Assert.assertFalse(carrotPlant.getHasBeenHarvested());
    }

    @Test
    public void harvestedTest2() {
        carrotPlant.setHasBeenHarvested(true);
        Assert.assertTrue(carrotPlant.getHasBeenHarvested());
    }



    @Test
    public void yield() {
    }

    @Test
    public void addToStoreHouse() {
    }

    @Test
    public void getCropType() {
    }


}