package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {
    private List<Horse> horses;

    public Stable() {
        this.horses = new ArrayList<>();
    }

    public void addHorse(Horse horse){
        horses.add(horse);

    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public Integer getNumberOfHorses(){
        return horses.size();
    }

}
