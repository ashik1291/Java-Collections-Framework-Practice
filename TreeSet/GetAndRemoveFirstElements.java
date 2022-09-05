package com.TreeSet;

import java.util.Collections;
import java.util.TreeSet;

public class GetAndRemoveFirstElements {
    public static void main(String[] args) {
        var number = new TreeSet<Integer>();

        Collections.addAll(number, 32, 35, 55, 50, 60, 4, 5, 1 , 2, 10, 12);

        System.out.println(number);
        int firstElement = number.pollFirst();
        System.out.println(number);
    }
}
