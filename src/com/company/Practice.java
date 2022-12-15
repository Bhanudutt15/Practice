package com.company;

import java.util.*;

public class Practice {

    public static void main(String args[]){

        List<String> listArray = new ArrayList<String>();
        listArray.add("Hello");
        listArray.add("World");

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);

        System.out.println(Arrays.asList(map));

        for(Map.Entry<String,Integer> entry : map.entrySet()){

            System.out.println(entry.getKey() + " value is " + entry.getValue());

        }

    //    System.out.println(listArray);
    }
}
