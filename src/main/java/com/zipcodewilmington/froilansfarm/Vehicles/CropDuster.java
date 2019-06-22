package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FarmHouse;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

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
import java.util.ArrayList;

public class CropDuster extends Aircraft implements FarmVehicle {

    //should make some of these singletons asap
    private Farm froilanFarm;
    private CropRow<CornStalk> cornRow1;
    private CropRow<TomatoPlant> tomatoRow1;
    private CropRow<CornStalk> cornRow2;
    private CropRow<Crop> genericRow;
    private Field thisField = new Field();
    private ArrayList<CropRow> rows;
    private FarmHouse farmHouse;

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


    public CropDuster() {



        Boolean act, exp;

        thisField.setHasBeenFertilized(false);
        act = thisField.getHasBeenFertilized();

        exp = true;
        thisField.setHasBeenFertilized(exp);
        act = thisField.getHasBeenFertilized();


    }



    public void fertilize(Field field){
        //Sets Field,hasBeenFertilized to true
    }

    public void operate() {

    }

    public void operate(Farm farm) {

    }
}
