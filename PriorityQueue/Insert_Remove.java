package com.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Insert_Remove {
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<>();

        Collections.addAll(colors, "Blue", "Black", "Red");

        System.out.println(colors);
        System.out.println(colors.poll());
        System.out.println(colors.peek());
    }
}
