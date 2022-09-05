package com.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class IterateHashList {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        Collections.addAll(colors, "Yellow", "Pink");

        Iterator<String> colorIterator = colors.iterator();

        while (colorIterator.hasNext()){
            System.out.println(colorIterator.next());
        }
    }
}
