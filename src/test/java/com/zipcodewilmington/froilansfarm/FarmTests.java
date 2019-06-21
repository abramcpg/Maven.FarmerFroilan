package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTests {

    private Farm froilanFarm;
    private CropRow<CornStalk> cornRow1;
    private CropRow<TomatoPlant> tomatoRow1;
    private CropRow<CornStalk> cornRow2;
    private CropRow<Crop> genericRow;
    private Field thisField = new Field();
    private ArrayList<CropRow> rows;
    private FarmHouse farmHouse;


    @Before
    public void setUp(){
        froilanFarm = new Farm();
        cornRow1 = new CropRow<>();
        cornRow2 = new CropRow<>();
        tomatoRow1 = new CropRow<>();
        genericRow = new CropRow<>();
        rows = new ArrayList<>();
        farmHouse = new FarmHouse();
        froilanFarm.setFarmHouse(farmHouse);
        froilanFarm.setField(thisField);
    }



    @Test
    public void farmTest1(){
        Assert.assertNotNull(froilanFarm.getFarmHouse());
    }

    @Test
    public void farmTest2(){
        Assert.assertNotNull(froilanFarm.getField());
    }

    @Test
    public void setField(){
        froilanFarm.setField(new Field());
        Assert.assertNotNull(froilanFarm.getField());
    }

    @Test
    public void farmTest3(){
        rows.add(cornRow1);
        rows.add(tomatoRow1);

        Integer expected = 2;
        Integer actual = rows.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void farmTest4(){
        rows.add(cornRow1);
        rows.add(tomatoRow1);
        rows.add(cornRow2);

        thisField.setCropRows(rows);

        Integer expected = 3;
        Integer actual = froilanFarm.getField().getCropRows().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void farmTest5(){
        rows.add(cornRow1);

        CornStalk stalk1 = new CornStalk();
        CornStalk stalk2 = new CornStalk();
        CornStalk stalk3 = new CornStalk();

        cornRow1.addCrop(stalk1);
        cornRow1.addCrop(stalk2);
        cornRow1.addCrop(stalk3);

        Integer expected = 3;
        Integer actual = cornRow1.getCrops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void farmTest6(){
        rows.add(cornRow1);

        CornStalk stalk1 = new CornStalk();
        cornRow1.addCrop(stalk1);

        froilanFarm.getField().setCropRows(rows);

        Integer expected = 1;
        Integer actual = froilanFarm.getField().getCropRows().get(0).getCrops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void farmTest7(){
        froilanFarm.getField().setCropRows(rows);
        rows.add(cornRow1);
        rows.add(cornRow2);
        rows.add(genericRow);

        CornStalk stalk1 = new CornStalk();
        TomatoPlant tomatoPlant1 = new TomatoPlant();
        genericRow.addCrop(stalk1);
        genericRow.addCrop(tomatoPlant1);

        Assert.assertTrue(froilanFarm.getField().getCropRows().get(2).getCrops().get(0) instanceof CornStalk);
        Assert.assertTrue(froilanFarm.getField().getCropRows().get(2).getCrops().get(1) instanceof TomatoPlant);
    }







}
