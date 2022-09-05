package com.TreeSet;

import java.util.Collections;
import java.util.TreeSet;

public class NumberLessThan7 {
    public static void main(String[] args) {
        var number = new TreeSet<Integer>();

        Collections.addAll(number, 4, 5, 1 , 2, 10, 12);

        var treeHeadSet = number.headSet(7);

        System.out.println(treeHeadSet);
    }
}
