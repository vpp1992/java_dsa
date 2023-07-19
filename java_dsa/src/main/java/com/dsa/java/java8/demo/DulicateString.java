package com.dsa.java.java8.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DulicateString {
    public static void main(String[] args) {
        String s = "vineet";
        extracted(s);
        System.out.println("----------------");

        Character character = s.chars().mapToObj(x -> Character.toLowerCase((char) x))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(character);


    }

    private static void extracted(String s) {

        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (chars[i]==chars[j]){
                    System.out.println(chars[j]);
                }
            }
        }
    }

}
