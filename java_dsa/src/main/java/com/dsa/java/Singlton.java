package com.dsa.java;

public class Singlton {
    private Singlton singlton=null;
    private Singlton(){

    }

    public   Singlton  instanceSinglton(){
        if (singlton==null){
             return singlton=new Singlton();
        }
        return singlton;

    }

}
