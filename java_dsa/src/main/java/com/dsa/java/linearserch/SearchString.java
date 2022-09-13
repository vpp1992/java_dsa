package com.dsa.java.linearserch;

import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {

        String name ="vineet";

        System.out.println(Arrays.toString(name.toCharArray()));

        char target='z';
        System.out.println(isSearchString(name, target));

        System.out.println("=============");
        System.out.println(isSearchStringForEach(name, target));

    }


 static boolean isSearchString(String searchString,char target) {
        if(searchString.length()==0) return false;
     for (int index = 0; index <searchString.length() ; index++) {
         if (searchString.charAt(index)==target){
             return  true;
         }

     }
     return false;
 }
 static boolean isSearchStringForEach(String searchString,char target) {
        if(searchString.length()==0) return false;
     for (char c:searchString.toCharArray()) {
         if (c==target)
         {
             return true;
         }

     }
     return false;
 }

}
