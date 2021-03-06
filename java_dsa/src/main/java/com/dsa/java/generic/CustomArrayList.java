package com.dsa.java.generic;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (this.isFull()){
            resize();
        }
        data[size++]=num;
    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }

    private void resize() {
        int[] temp= new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
          temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public static void main(String[] args) {

    }
}
