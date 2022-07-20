package com.dsa.java.CLONE;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human=new Human(34,"Vineet");
        Human twin=(Human)human.clone();

    }
}
