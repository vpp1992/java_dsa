package com.dsa.java.java8;

public class ReverseString {
    public static void main(String[] args) {
        String s="vineet";
        char[] chars = s.toCharArray();
        for (int i = chars.length-1; i>=0; i--) {
            System.out.println(chars[i]);
        }
    }
}
