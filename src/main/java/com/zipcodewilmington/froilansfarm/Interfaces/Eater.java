package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Eater <T extends EdibleObject> {

    public void eat(T edibleObject, Integer numberOfEdibles);
}
