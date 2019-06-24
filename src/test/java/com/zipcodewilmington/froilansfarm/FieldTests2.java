package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.EdibleObjects.Egg;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FieldTests2 {

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
        froilan.plantRow(new CornStalk(), cornRow1, 10);
        froilan.plantRow(new CornStalk(), cornRow2, 20);
        froilan.plantRow(new TomatoPlant(), tomatoRow1, 10);
        froilan.plantRow(new CornStalk(), genericRow, 5);
        froilan.plantRow(new TomatoPlant(), genericRow, 5);
        froilanFarm.getField().addCropRow(cornRow1);
        froilanFarm.getField().addCropRow(cornRow2);
        froilanFarm.getField().addCropRow(tomatoRow1);
        froilanFarm.getField().addCropRow(genericRow);
    }

    @After
    public void tearDown() {
        cornStoreHouse.clearStorehouse();
        tomatoStoreHouse.clearStorehouse();
        eggStoreHouse.clearStorehouse();
        thisField.setCropRows(new ArrayList<>());
    }

    @Test
    public void emptyTest() {
        Integer expected = 0;
        Integer actual = cornStoreHouse.getAmountInStorage();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestTest1() {
        Crop crop = froilanFarm.getField().getCropRows().get(0).getCrop(0);
        Assert.assertFalse(crop.getHasBeenHarvested());
    }

    @Test
    public void harvestTest2() {
        Crop crop = froilanFarm.getField().getCropRows().get(0).getCrop(0);
        Assert.assertFalse(crop.getHasBeenFertilized());
    }

    @Test
    public void harvestTest3() {
        Assert.assertFalse(froilanFarm.getField().getHasBeenFertilized());
    }

    @Test
    public void harvestTest4() {
        Assert.assertFalse(froilanFarm.getField().getHasBeenFertilized());
    }

    @Test
    public void harvestTest5() {
        froilanFarm.getField().harvestField();
        Assert.assertTrue(froilanFarm.getField().getHasBeenHarvested());
    }

    @Test
    public void harvestTest6() {
        froilanFarm.getField().fertilizeField();
        Assert.assertTrue(froilanFarm.getField().getHasBeenFertilized());
    }




    @Test
    public void harvestTest7() {
        ArrayList<EdibleObject> foodList = froilanFarm.getField().harvestField();
        Integer expected = 50;
        Integer actual = foodList.size();

        Assert.assertEquals(expected, actual);
        Assert.assertNull(foodList.get(0));
    }

    @Test
    public void harvestTest8() {
        froilanFarm.getField().fertilizeField();
        ArrayList<EdibleObject> foodList = froilanFarm.getField().harvestField();
        Integer expected = 50;
        Integer actual = foodList.size();

        System.out.println(foodList);
        Assert.assertEquals(expected, actual);
        Assert.assertNotNull(foodList.get(0));
    }

    @Test
    public void harvestTest9() {
        froilanFarm.getField().fertilizeField();
        ArrayList<EdibleObject> foodList = froilanFarm.getField().harvestField();

        Assert.assertTrue(froilanFarm.getField().getCropRows().get(0).getCrop(0).getHasBeenHarvested());
        Assert.assertTrue(froilanFarm.getField().getHasBeenHarvested());
        Assert.assertNotNull(foodList.get(0));
    }

    @Test
    public void harvestTest10() {
        froilanFarm.getField().fertilizeField();
        Assert.assertFalse(froilanFarm.getField().getCropRows().get(0).getCrop(0).getHasBeenHarvested());

        froilanFarm.getField().harvestField();

        Assert.assertFalse(froilanFarm.getField().getCropRows().get(0).getCrop(0).getHasBeenFertilized());
    }

    @Test
    public void harvestTest11() {
        Integer initialExpected = 0;
        Integer initialActual = CornStoreHouse.getInstance().getAmountInStorage();

        froilanFarm.getField().fertilizeField();
        ArrayList<EdibleObject> foodList = froilanFarm.getField().harvestField();
        Barn.getInstance().addToStorage(foodList);

        Integer resultingExpected = 35;
        Integer resultingActual = CornStoreHouse.getInstance().getAmountInStorage();

        Assert.assertEquals(initialExpected, initialActual);
        Assert.assertEquals(resultingExpected, resultingActual);
    }

    @Test
    public void harvestTest12() {
        Integer initialExpected = 0;
        Integer initialActual = TomatoStoreHouse.getInstance().getAmountInStorage();

        froilanFarm.getField().fertilizeField();
        ArrayList<EdibleObject> foodList = froilanFarm.getField().harvestField();
        Barn.getInstance().addToStorage(foodList);

        Integer resultingExpected = 15;
        Integer resultingActual = TomatoStoreHouse.getInstance().getAmountInStorage();

        Assert.assertEquals(initialExpected, initialActual);
        Assert.assertEquals(resultingExpected, resultingActual);
    }

    @Test
    public void harvestTest13() {
        Integer initialExpected = 0;
        Integer initialActual = EggStoreHouse.getInstance().getAmountInStorage();

        froilanFarm.getField().fertilizeField();
        ArrayList<EdibleObject> foodList = froilanFarm.getField().harvestField();
        foodList.add(new Egg());
        foodList.add(new Egg());
        foodList.add(new Egg());
        foodList.add(null);

        Barn.getInstance().addToStorage(foodList);

        Integer resultingExpected = 3;
        Integer resultingActual = EggStoreHouse.getInstance().getAmountInStorage();

        Assert.assertEquals(initialExpected, initialActual);
        Assert.assertEquals(resultingExpected, resultingActual);
    }




}
