package com.dsa.java.linearserch;

public class SearchString {
    public static void main(String[] args) {

        String name ="vineet";
        char target='v';
        System.out.println(searchCharacters(name,target));

    }

    private static boolean searchCharacters(String name, char target) {

        if(name.length() == 0)
            return false;
        for(int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
