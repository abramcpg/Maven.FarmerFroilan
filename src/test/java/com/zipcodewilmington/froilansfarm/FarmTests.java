package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.EdibleObjects.EarCorn;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.StoreHouses.Barn;
import com.zipcodewilmington.froilansfarm.StoreHouses.CornStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.EggStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.TomatoStoreHouse;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTests {


    //should make some of these singletons asap
    private Farm froilanFarm;
    private CropRow<CornStalk> cornRow1;
    private CropRow<TomatoPlant> tomatoRow1;
    private CropRow<CornStalk> cornRow2;
    private CropRow<Crop> genericRow;
    private Field thisField = new Field();
    private ArrayList<CropRow> rows;
    private FarmHouse farmHouse;
    private CornStoreHouse cornStoreHouse;
    private TomatoStoreHouse tomatoStoreHouse;
    private EggStoreHouse eggStoreHouse;



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
        cornStoreHouse = froilanFarm.getBarn().getCornStoreHouse();
        tomatoStoreHouse = froilanFarm.getBarn().getTomatoStoreHouse();
        eggStoreHouse = froilanFarm.getBarn().getEggStoreHouse();
    }

    @After
    public void tearDown() {
        cornStoreHouse.clearStorehouse();
        tomatoStoreHouse.clearStorehouse();
        eggStoreHouse.clearStorehouse();
    }


    @Test
    public void farmhouseTest() {
        Assert.assertNotNull(froilanFarm.getFarmHouse());
    }

    @Test
    public void fieldTest() {
        Assert.assertNotNull(froilanFarm.getField());
    }

    @Test
    public void fieldTest2() {
        Assert.assertNotNull(froilanFarm.getField().getCropRows());
    }

    @Test
    public void setFieldTest() {
        froilanFarm.setField(new Field());
        Assert.assertNotNull(froilanFarm.getField());
    }

    @Test
    public void yieldTest() {
        CornStalk stalk1 = new CornStalk();
        EarCorn corn1 = stalk1.Yield(); //why must I cast this?
        Assert.assertNotNull(corn1);
    }

    @Test
    public void rowTest() {
        rows.add(cornRow1);
        rows.add(tomatoRow1);

        Integer expected = 2;
        Integer actual = rows.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fieldRowTest() {
        rows.add(cornRow1);
        rows.add(tomatoRow1);
        rows.add(cornRow2);

        Integer expected = 3;
        Integer actual = froilanFarm.getField().getCropRows().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCropsTest() {
        rows.add(cornRow1);

        cornRow1.addCrop(new CornStalk());
        cornRow1.addCrop(new CornStalk());
        cornRow1.addCrop(new CornStalk());

        Integer expected = 3;
        Integer actual = cornRow1.getCrops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCropsTest2() {
        rows.add(cornRow1);
        cornRow1.addCrop(new CornStalk());

        Integer expected = 1;
        Integer actual = froilanFarm.getField().getCropRows().get(0).getCrops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void genericRowTest() {
        rows.add(cornRow1);
        rows.add(cornRow2);
        rows.add(genericRow);

        genericRow.addCrop(new CornStalk());
        genericRow.addCrop(new TomatoPlant());

        Assert.assertTrue(froilanFarm.getField().getCropRows().get(2).getCrops().get(0) instanceof CornStalk);
        Assert.assertTrue(froilanFarm.getField().getCropRows().get(2).getCrops().get(1) instanceof TomatoPlant);
    }


    @Test
    public void yieldTest2() {
        cornRow1.addCrop(new CornStalk());
        cornRow1.addCrop(new CornStalk());
        cornRow1.addCrop(new CornStalk());
        cornRow1.addCrop(new CornStalk());

        ArrayList<EdibleObject> edibleList = new ArrayList<>();


        //should generify this process
        for (CornStalk stalk : cornRow1.getCrops()) {
            edibleList.add(stalk.Yield());
        }

        Integer expected = 4;
        Integer actual = edibleList.size();
        Assert.assertEquals(expected, actual);
        Assert.assertTrue(edibleList.get(0) instanceof EarCorn);
    }


    @Test
    public void storeHouseTest(){
//        Barn barn = froilanFarm.getBarn();
//        CornStoreHouse cornHouse = barn.getCornStoreHouse();
        CornStoreHouse cornHouse = froilanFarm.getBarn().getCornStoreHouse();
        
        ArrayList<EarCorn> cornList = new ArrayList<>();

        cornList.add(new EarCorn());
        cornList.add(new EarCorn());
        cornList.add(new EarCorn());
        cornList.add(new EarCorn());

        cornHouse.setEdibleObjects(cornList);

        Integer expected = 4;
        Integer actual = cornHouse.getEdibleObjects().size();
        Assert.assertEquals(expected, actual);
    }


}



