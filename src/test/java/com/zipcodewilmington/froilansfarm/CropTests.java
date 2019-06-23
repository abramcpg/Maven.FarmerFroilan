package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CropTests {
    TomatoPlant tomatoPlant = new TomatoPlant();
    CornStalk cornStalk = new CornStalk();
    ArrayList<Crop> row = new ArrayList<>();

    CropRow cropRows = new CropRow();
    Field thisField = new Field();


    @Before
    public void setUp() {
        row.add(tomatoPlant);
        row.add(cornStalk);
        row.add(tomatoPlant);
        cropRows.setCrops(row);
        thisField.addCropRow(cropRows);
        thisField.addCropRow(cropRows);
    }

    @After
    public void tearDown() {

    }


    @Test
    public void cropRowsTest1() {
        Assert.assertTrue(thisField.getCropRows().size() == 2);
    }

    @Test
    public void cropRowsTest2() {
        CropRow row1 = thisField.getCropRows().get(0);
        Assert.assertTrue(row1.getCrops().size() == 3);
    }


    @Test
    public void fertilizeTest() {
        Assert.assertFalse(tomatoPlant.getHasBeenFertilized());
    }

    @Test
    public void fertilizeTest2() {
        tomatoPlant.setHasBeenFertilized(true);
        Assert.assertTrue(tomatoPlant.getHasBeenFertilized());
    }

    @Test
    public void fertilizeTest3() {
        CropRow row1 = thisField.getCropRows().get(0);
        Crop crop = row1.getCrop(0);
        Assert.assertFalse(crop.getHasBeenFertilized());
    }

    @Test
    public void fertilizeTest4() {
        CropRow row1 = thisField.getCropRows().get(0);
        row1.fertilizeRow();
        Crop crop = row1.getCrop(0);
        Assert.assertTrue(crop.getHasBeenFertilized());
    }

    @Test
    public void fertilizeTest5() {
        CropRow row1 = thisField.getCropRows().get(0);
        row1.fertilizeRow();
        Crop crop = row1.getCrop(1);
        Assert.assertTrue(crop.getHasBeenFertilized());
    }


    @Test
    public void harvestedTest() {
        Assert.assertFalse(tomatoPlant.getHasBeenHarvested());
    }

    @Test
    public void harvestedTest2() {
        tomatoPlant.setHasBeenHarvested(true);
        Assert.assertTrue(tomatoPlant.getHasBeenHarvested());
    }

    @Test
    public void harvestedTest3() {
        CropRow row1 = thisField.getCropRows().get(0);
        Crop crop = row1.getCrop(0);
        Assert.assertFalse(crop.getHasBeenHarvested());
    }

    @Test
    public void harvestedTest4() {
        CropRow row1 = thisField.getCropRows().get(0);
        row1.harvestRow();
        Crop crop = row1.getCrop(0);
        Assert.assertTrue(crop.getHasBeenHarvested());
    }

    @Test
    public void harvestedTest5() {
        CropRow row1 = thisField.getCropRows().get(0);
        row1.harvestRow();
        Crop crop = row1.getCrop(1);
        Assert.assertTrue(crop.getHasBeenHarvested());
    }

    @Test
    public void harvestedTest6() {
        ArrayList<Crop> theseCrops = thisField.getCropRows().get(0).harvestRow();
        Crop crop = theseCrops.get(0);
        Assert.assertTrue(crop.getHasBeenHarvested());
    }








}
