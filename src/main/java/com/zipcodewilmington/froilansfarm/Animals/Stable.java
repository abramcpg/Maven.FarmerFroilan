package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {
    List<Horse> horses;

    public Stable() {
        this.horses = new ArrayList<>();
    }

    public void addHorse(){

    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }
}
