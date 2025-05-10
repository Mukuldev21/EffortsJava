package org.automation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class listPractice02 {

    //Question: To sort an ArrayList Alphabetically
    @Test
    public void sortArrayList(){

        ArrayList<String> colours = new ArrayList<>();
        colours.add("Crimson");
        colours.add("Beige");
        colours.add("Prussian Blue");
        colours.add("Magenta");
        colours.add("Cyan");
        colours.add("Teal");
        colours.add("Mauve");
        colours.add("Umber");

        //Sort the ArrayList
         Collections.sort(colours);

        System.out.println("Sort list colors");
        for(String colourNames : colours) {
            System.out.println(colourNames);
        }
    }

    @Test
    public void sortArrayListReverse(){

        ArrayList<String> list = new ArrayList<>();

        list.add("Ace");
        list.add("pen");
        list.add("Xeno");
        list.add("Ben");
        list.add("Zest");
        list.add("Max");
        list.add("Clen");

        list.sort(Collections.reverseOrder());

        System.out.println("Reverse/Descending order");
        for(String names : list) {
            System.out.println(names);
        }


    }


}
