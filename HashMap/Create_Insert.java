package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Create_Insert {
    public static void main(String[] args) {
        HashMap <Integer, String> name = new HashMap<>();
        name.put(1, "Ashik");
        name.put(2, "Rizwan");
        name.put(3, "Salsa");

        for(var elements: name.entrySet()){
            System.out.println(elements.getKey() + " " + elements.getValue());
        }
    }
}
