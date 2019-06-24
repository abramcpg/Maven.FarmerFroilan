package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Farm.Farmer;
import com.zipcodewilmington.froilansfarm.Farm.Pilot;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.*;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class VehicleOperateTests {

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
    private CarrotStoreHouse carrotStoreHouse = froilanFarm.getBarn().getCarrotStoreHouse();
    private CropDuster cropDuster = new CropDuster();
    private Pilot froilanda = new Pilot();
    private Tractor tractor = new Tractor();




    @Before
    public void setUp() {
        froilanFarm.setField(thisField);
        froilanFarm.getField().setCropRows(rows);
        froilan.plantRow(new CornStalk(), cornRow1, 10);
        froilan.plantRow(new CornStalk(), cornRow2, 20);
        froilan.plantRow(new TomatoPlant(), tomatoRow1, 10);
        froilan.plantRow(new CornStalk(), genericRow, 5);
        froilan.plantRow(new TomatoPlant(), genericRow, 5);
        froilan.plantRow(new CarrotPlant(), genericRow, 5);

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
        carrotStoreHouse.clearStorehouse();
        thisField.setCropRows(new ArrayList<>());
    }

    @Test
    public void cropDusterTest() {
        Assert.assertFalse(thisField.getHasBeenFertilized());
    }

    @Test
    public void cropDusterTest2() {
        froilanda.pilot(cropDuster);
        Assert.assertTrue(thisField.getCropRows().get(0).getCrop(1).getHasBeenFertilized());
    }

    @Test
    public void cropDusterTest3() {
        froilanda.pilot(cropDuster);
        Assert.assertTrue(thisField.getHasBeenFertilized());
    }

    @Test
    public void cropDusterTest4() {
        Assert.assertFalse(thisField.getCropRows().get(0).getCrop(1).getHasBeenFertilized());
    }

    @Test
    public void tractorTest1() {
        Assert.assertFalse(thisField.getHasBeenHarvested());
    }

    @Test
    public void tractorTest2() {
        froilan.pilot(tractor);
        Assert.assertTrue(thisField.getHasBeenHarvested());
    }

    @Test
    public void tractorTest3() {
        froilan.pilot(tractor);
        Assert.assertTrue(thisField.getCropRows().get(0).getCrop(1).getHasBeenHarvested());
    }

    @Test
    public void tractorTest4() {
        Assert.assertFalse(thisField.getCropRows().get(0).getCrop(1).getHasBeenHarvested());
    }

    @Test
    public void harvestTest() {
        froilanda.pilot(cropDuster);
        froilan.pilot(tractor);

        Integer expected = 35;
        Integer actual = cornStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
        }

    @Test
    public void harvestTest2() {
        froilanda.pilot(cropDuster);
        froilan.pilot(tractor);

        Integer expected = 5;
        Integer actual = carrotStoreHouse.getAmountInStorage();
        System.out.println(carrotStoreHouse.getEdibleObjects().toString());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestTest3() {
        froilanda.pilot(cropDuster);
        froilan.pilot(tractor);

        Integer expected = 15;
        Integer actual = tomatoStoreHouse.getAmountInStorage();

        Assert.assertEquals(expected, actual);
    }

}
