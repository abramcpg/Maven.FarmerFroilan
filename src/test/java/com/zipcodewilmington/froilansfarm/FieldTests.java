package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.CornStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.EggStoreHouse;
import com.zipcodewilmington.froilansfarm.StoreHouses.TomatoStoreHouse;
import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;

public class FieldTests {

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
    private EggStoreHouse eggStoreHouse = froilanFarm.getBarn().getEggStoreHouse();;



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
    }


}
