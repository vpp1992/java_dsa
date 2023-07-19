package com.dsa.java.demo.designpattern.factory;

public class ProfessionFactory {
    public Profession getProfession(String profession){
        if (profession==null){
            return null;
        }
        if (profession.equalsIgnoreCase("Doctor")){
            return new Doctor();
        }

        if (profession.equalsIgnoreCase("Engineer")){
            return new Enginner();
        }
        return null;
    }
}
