package com.dsa.java.java8.functionalintr;
/*
* daimond issue resolve interfacename.supar.methodaname
*
* */
public class DaiondProblemClass implements DaimondProblemInterface1 ,DaimondProblemInterface2{
    @Override
    public void m1() {
        DaimondProblemInterface1.super.m1();
    }

    public static void main(String[] args) {
        DaiondProblemClass problemClass=new DaiondProblemClass();
        problemClass.m1();
    }
}
