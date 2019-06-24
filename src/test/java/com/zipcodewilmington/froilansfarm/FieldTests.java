package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Carrot;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Tomato;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.CornStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.EggStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.TomatoStoreHouse;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FieldTests {

    private Farmer froilan = new Farmer("Froilan");
    private Farm froilanFarm = Farm.getInstance();
    private CropRow<CornStalk> cornRow1 = new CropRow<>();
    private CropRow<TomatoPlant> tomatoRow1 = new CropRow<>();
    private CropRow<CornStalk> cornRow2 = new CropRow<>();
    private CropRow<Crop> genericRow = new CropRow<>();
    private Field thisField = new Field();
    private ArrayList<CropRow> rows = new ArrayList<>();
    private FarmHouse farmHouse = FarmHouse.getInstance();
    private CornStoreHouse cornStoreHouse  = froilanFarm.getBarn().getCornStoreHouse();
    private TomatoStoreHouse tomatoStoreHouse = froilanFarm.getBarn().getTomatoStoreHouse();
    private EggStoreHouse eggStoreHouse = froilanFarm.getBarn().getEggStoreHouse();



    @Before
    public void setUp() {
        froilanFarm.setField(thisField);
        froilanFarm.getField().setCropRows(rows);
    }

    @After
    public void tearDown() {
        cornStoreHouse.clearStorehouse();
        tomatoStoreHouse.clearStorehouse();
        eggStoreHouse.clearStorehouse();
        thisField.setCropRows(new ArrayList<>());
    }

    @Test
    public void fertTest() {
        Assert.assertFalse(thisField.getHasBeenFertilized());
    }

    @Test
    public void harvestedTest() {
        Assert.assertFalse(thisField.getHasBeenHarvested());
    }

    @Test
    public void fertTest2() {
        thisField.setHasBeenFertilized(true);
        Assert.assertTrue(thisField.getHasBeenFertilized());
    }

    @Test
    public void harvestedTest2() {
        thisField.setHasBeenHarvested(true);
        Assert.assertTrue(thisField.getHasBeenHarvested());
    }

    @Test
    public void fertTest3() {
        thisField.fertilizeField();
        Assert.assertTrue(thisField.getHasBeenFertilized());
    }

    @Test
    public void harvestedTest3() {
        thisField.harvestField();
        Assert.assertTrue(thisField.getHasBeenHarvested());
    }






    @Test
    public void addCropRow1(){
        thisField.addCropRow(cornRow1);

        Integer expected = 1;
        Integer actual = thisField.getCropRows().size();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void addCropRow2(){
        thisField.addCropRow(cornRow1);
        thisField.addCropRow(cornRow2);
        thisField.addCropRow(tomatoRow1);
        thisField.addCropRow(genericRow);

        Integer expected = 4;
        Integer actual = thisField.getCropRows().size();

        Assert.assertEquals(expected, actual);
    }



    @Test
    public void plantRowTest1(){
        thisField.addCropRow(cornRow1);

        froilan.plantRow(new CornStalk(), cornRow1, 1);

        Integer expected = 1;
        Integer actual = cornRow1.getCrops().size();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void plantRowTest2(){
        thisField.addCropRow(cornRow1);

        froilan.plantRow(new CornStalk(), cornRow1, 30);



        Integer expected = 30;
        Integer actual = cornRow1.getCrops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void newRowTest() {
        ArrayList<Crop> cropList = new ArrayList<>();
        cropList.add (new CornStalk());
        cropList.add (new CornStalk());
        cropList.add (new TomatoPlant());

        genericRow = new CropRow<>(cropList);

        Integer expected = 3;
        Integer actual = genericRow.getCrops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCropTest() {
        ArrayList<Crop> cropList = new ArrayList<>();
        cropList.add (new CornStalk());
        cropList.add (new CornStalk());
        cropList.add (new TomatoPlant());

        genericRow.setCrops(cropList);

        Integer expected = 3;
        Integer actual = genericRow.getCrops().size();

        Assert.assertEquals(expected, actual);
    }



    @Test
    public void fertTest4() {
        froilan.plantRow(new CornStalk(), cornRow1, 10);
        thisField.addCropRow(cornRow1);

        //thisField.fertilizeField();
        Assert.assertFalse(cornRow1.getCrops().get(0).getHasBeenFertilized());
    }

    @Test
    public void harvestedTest4() {
        froilan.plantRow(new CornStalk(), cornRow1, 10);
        thisField.addCropRow(cornRow1);

        //thisField.fertilizeField();
        Assert.assertFalse(cornRow1.getCrops().get(0).getHasBeenHarvested());
    }

    @Test
    public void fertTest5() {
        froilan.plantRow(new TomatoPlant(), tomatoRow1, 10);
        thisField.addCropRow(tomatoRow1);
        thisField.fertilizeField();
        Assert.assertTrue(tomatoRow1.getCrops().get(0).getHasBeenFertilized());
    }

    @Test
    public void harvestedTest6() {
        froilan.plantRow(new TomatoPlant(), tomatoRow1, 10);
        thisField.addCropRow(tomatoRow1);

        thisField.harvestField();
        Assert.assertTrue(tomatoRow1.getCrops().get(0).getHasBeenHarvested());
    }

    @Test
    public void carrotTest() {
        ArrayList<Crop> cropList = new ArrayList<>();
        cropList.add (new CornStalk());
        cropList.add (new CornStalk());
        cropList.add (new TomatoPlant());
        cropList.add (new CarrotPlant());

        genericRow = new CropRow<>(cropList);

        Integer expected = 4;
        Integer actual = genericRow.getCrops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void carrotTest2() {
        ArrayList<Crop> cropList = new ArrayList<>();
        cropList.add (new CornStalk());
        cropList.add (new CornStalk());
        cropList.add (new TomatoPlant());
        cropList.add (new CarrotPlant());

        genericRow = new CropRow<>(cropList);
        genericRow.fertilizeRow();

        EdibleObject actual = genericRow.getCrops().get(3).Yield();
        Assert.assertTrue(actual instanceof Carrot);
    }










}
