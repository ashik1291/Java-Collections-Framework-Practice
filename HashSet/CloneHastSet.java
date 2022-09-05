package com.HashSet;

import java.util.Collections;
import java.util.HashSet;

public class CloneHastSet {
    public static void main(String[] args) {
        var colors = new HashSet<>();
        Collections.addAll(colors, "Red","Yellow", "White", "Blue");

        var clonedColors = colors.clone();

        // HashSet to Array
        String[] colorsArray = new String[colors.size()];
        colors.toArray(colorsArray);

        for(String color:colorsArray){
            System.out.println(color);
        }
    }
}
