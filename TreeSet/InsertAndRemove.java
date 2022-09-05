package com.TreeSet;

import java.util.TreeSet;

public class InsertAndRemove {
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>();
        name.add("John");
        name.add("Longcross");
        name.add("Lizard");

        System.out.println(name);

        name.remove("Longcross");
        System.out.println(name);
    }
}
