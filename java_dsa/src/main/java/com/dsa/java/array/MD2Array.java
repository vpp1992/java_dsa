package com.dsa.java.array;

import java.util.ArrayList;
import java.util.Scanner;

public class MD2Array {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        ArrayList<ArrayList> arrayLists=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayLists.add(new ArrayList());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayLists.get(i).add(input.nextInt());
            }
            System.out.println(arrayLists);
        }

    }
}
