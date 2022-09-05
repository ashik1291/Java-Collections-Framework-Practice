package com.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {
    public static void main(String[] args) {
        var age = new HashSet<>();
        Collections.addAll(age, 20,30, 5, 40);

        var ageTree = new TreeSet<>(age);

        System.out.println(ageTree);
    }
}
