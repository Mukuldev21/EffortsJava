package org.automation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class listPractice03 {

    //Question: Find the maximum number
    @Test
    public void maximumNumber(){

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(89);
        numbers.add(34);
        numbers.add(11);

        int max = numbers.getFirst();

        for(int num : numbers){
            if(max<num){
                max=num;
            }
        }

        System.out.println("The maximum number is: " +max);
    }
}
