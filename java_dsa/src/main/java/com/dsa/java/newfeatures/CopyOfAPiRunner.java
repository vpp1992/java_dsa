package com.dsa.java.newfeatures;

import java.util.ArrayList;
import java.util.List;

public class CopyOfAPiRunner {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("vineet");
        names.add("vineet1");
        names.add("vineet2");
        names.add("vineet3");
        List<String> strings = List.copyOf(names);
       // doNotChange(strings);

    }

    private static void doNotChange(List<String> names) {
        names.add("ShouldNotBeAllowed");
    }
}
