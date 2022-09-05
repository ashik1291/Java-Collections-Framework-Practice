package com.HashSet;

import java.util.Collections;
import java.util.HashSet;

public class HashSetSize {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        Collections.addAll(colors, "Yellow", "Pink");

        System.out.println("HashSet Size: "+colors.size());
    }
}
