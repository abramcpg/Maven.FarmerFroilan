package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

public class Field {

    private List<CropRow> cropRows;
    private Boolean hasBeenFertilized;
    private Boolean hasBeenHarvested;


    public Field() {
        this.cropRows = new ArrayList<>();
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }






    public List<CropRow> getCropRows() {
        return this.cropRows;
    }

    public void setCropRows(List<CropRow> cropRows) {
        this.cropRows = cropRows;
    }

    public void addCropRow(CropRow<?> cropRow){
        cropRows.add(cropRow);
    }


    public void fertilize(){
        for (CropRow row : cropRows){
            row.fertilizeRow();
        }
        setHasBeenFertilized(true);
    }


    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}
