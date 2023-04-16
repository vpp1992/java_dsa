package com.dsa.java.java8intereview.daimond;

public class MainDaimond implements DaimondProblemInterface1 ,DaimondProblemInterface2 {
    public static void main(String[] args) {
  MainDaimond mainDaimond=new MainDaimond();
  mainDaimond.m1();
    }

    @Override
    public void m1() {
        DaimondProblemInterface1.super.m1();
        DaimondProblemInterface2.super.m1();
    }

}
