package com.HashSet;

import java.util.Collections;
import java.util.HashSet;

public class CompareHashSet {
    public static void main(String[] args) {
        var hashSet1 = new HashSet<Integer>();
        var hashSet2 = new HashSet<Integer>();

        Collections.addAll(hashSet1, 10, 5, 20, 40 );
        Collections.addAll(hashSet2, 5, 50, 60);

        for(int elements: hashSet2){
            System.out.println(hashSet1.contains(elements));
        }
    }
}
