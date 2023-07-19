package com.dsa.java.demo.designpattern.factory;

public class FactoryMainClass {
    public static void main(String[] args) {
        ProfessionFactory professionFactory=new ProfessionFactory();
        Profession doc=professionFactory.getProfession("Doctor");
        doc.print();
    }
}
