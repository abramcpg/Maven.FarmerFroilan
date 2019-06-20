package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Field {


    List<CropRow> cropRows;

    Boolean hasBeenFertilized;

    public List<CropRow> getCropRows() {
        return cropRows;
    }

    public void setCropRows(List<CropRow> cropRows) {
        this.cropRows = cropRows;
    }
}
