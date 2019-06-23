

package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.EdibleObject;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {


        public Horse() {
                String name = "";
                Boolean isFed = false;
                Boolean isRidden = false;
        }

        public void SetNotFedNotRidden(){

        }

        public void eat(Horse horse) {
                Boolean isFed = true;
        }

        public void setIsRidden(Horse horse){
                Boolean isRidden = true;
        }

        public Boolean checkisFed(Horse horse) {
                return null; //this.isFed;
        }

        public Boolean checkIsRidden(Horse horse){
                return null;
        }

        public String makeNoise(Horse horse) {

                return "Hello, Farmer Froilan. It is good to see you.";
        }

        public void eatFood(EdibleObject edibleObject, Integer numberOfEdibles) {

        }

        @Override
        public String makeNoise() { //Will return noise insted of null
                return null;
        }

        @Override
        public void eat(EdibleObject edibleObject, Integer numberOfEdibles) {

        }
}
