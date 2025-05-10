package org.automation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class listPractice04 {

    @Test
    public void minimumNumber(){

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(13);
        numbers.add(27);
        numbers.add(07);
        numbers.add(56);

        int min = numbers.getFirst();

        for(int num : numbers) {
            if(min>num){
                min = num;
            }
        }

        System.out.println("The minimum number is:" + min);
    }
}
