package com.zipcodewilmington.froilansfarm.Interfaces;

public interface EdibleObject {

    public boolean canBeEaten = true;

    default boolean getCanBeEaten(){
      return canBeEaten;
    }

}
