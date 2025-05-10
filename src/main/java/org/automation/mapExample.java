package org.automation;

import java.util.HashMap;
import java.util.Map;

public class mapExample {

    public static void main(String[] args) {

        Map<Integer, String> fruitMap = new HashMap<>();
        fruitMap.put(1, "Apple");
        fruitMap.put(2,"Banana");
        fruitMap.put(3,"Grapes");
        fruitMap.put(4, "Kiwi");
        fruitMap.put(5,"Mango");

        int key = 7;

        System.out.println("The fruit is: " + fruitMap.getOrDefault(key, "Unknown selection , please select again"));


    }
}
