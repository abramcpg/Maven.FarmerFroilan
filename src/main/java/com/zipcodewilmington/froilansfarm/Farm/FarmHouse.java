package com.zipcodewilmington.froilansfarm.Farm;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {

    private static final FarmHouse INSTANCE = new FarmHouse();
    private List<Person> people;




    private FarmHouse() {
        this.people = new ArrayList<>();
    }


    public static FarmHouse getInstance() {
        return INSTANCE;
    }

    public void addPerson() {
        //guests staying

    }


    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
