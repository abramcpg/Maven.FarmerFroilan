package com.zipcodewilmington.froilansfarm.Farm;

public enum DayOfWeek {

    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");



    private String dayName;

    DayOfWeek(String dayName){
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }
}
