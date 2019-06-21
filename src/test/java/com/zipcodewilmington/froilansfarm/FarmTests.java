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
    public void farmhouseTest(){
        Assert.assertNotNull(froilanFarm.getFarmHouse());
    }

    @Test
    public void fieldTest(){
        Assert.assertNotNull(froilanFarm.getField());
    }

    @Test
    public void setFieldTest(){
        froilanFarm.setField(new Field());
        Assert.assertNotNull(froilanFarm.getField());
    }

    @Test
    public void yieldTest(){
        CornStalk stalk1 = new CornStalk();
        EarCorn corn1 = (EarCorn) stalk1.Yield(); //why must I cast this?
        Assert.assertNotNull(corn1);
    }

    @Test
    public void rowTest(){
        rows.add(cornRow1);
        rows.add(tomatoRow1);

        Integer expected = 2;
        Integer actual = rows.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fieldRowTest(){
        rows.add(cornRow1);
        rows.add(tomatoRow1);
        rows.add(cornRow2);

        thisField.setCropRows(rows);

        Integer expected = 3;
        Integer actual = froilanFarm.getField().getCropRows().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCropsTest(){
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
    public void getCropsTest2(){
        rows.add(cornRow1);

        CornStalk stalk1 = new CornStalk();
        cornRow1.addCrop(stalk1);

        froilanFarm.getField().setCropRows(rows);

        Integer expected = 1;
        Integer actual = froilanFarm.getField().getCropRows().get(0).getCrops().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void genericRowTest(){
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
