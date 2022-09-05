package com.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());

        // Add numbers in the Queue
        pq1.add(20);
        pq1.add(10);
        pq1.add(30);
        pq1.add(5);
        pq1.add(15);
        pq1.add(3);

        System.out.println(pq1.peek());
        pq1.poll();
        System.out.println(pq1.peek());

    }
}
