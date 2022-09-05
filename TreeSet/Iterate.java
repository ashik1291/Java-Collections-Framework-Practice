package com.TreeSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Iterate {
    public static void main(String[] args) {
        TreeSet<Integer> roll = new TreeSet<>();
        Collections.addAll(roll, 4, 5, 1, 2);

        Iterator rollIterator = roll.iterator();

        while (rollIterator.hasNext()){
            System.out.println(rollIterator.next());
        }
    }
}
