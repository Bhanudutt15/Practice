package com.company;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatternClass {

    public static void main(String args[]) {

        String V1 = "1.1.3.13";
        String V2 = "1.1.3.1";
        PatternClass pa1 = new PatternClass();
        System.out.println( pa1.versionCheck(V1,V2));
        pa1.pairPrint();
    }
     int versionCheck(String v1,String v2) {

        int num=-1;
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(v1.split("[.]")));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList(v2.split("[.]")));

        while (arr1.size() != arr2.size()) {

            if (arr1.size() > arr2.size()) {

                arr2.add("0");

            } else if (arr2.size() > arr1.size()) {

                arr1.add("0");
            }
        }
        boolean equalCheck = false;
        for (int i = 0; i < arr1.size(); i++) {

            if (Integer.parseInt(arr1.get(i)) < Integer.parseInt(arr2.get(i))) {
                num=-1;
                equalCheck = true;
                break;

            } else if (Integer.parseInt(arr1.get(i)) > Integer.parseInt(arr2.get(i))) {
                num=1;
                equalCheck = true;
                break;
            }

        }
        if (!equalCheck) {
         num=0;
        }
       return num;
    }

    public void pairPrint() {

        int[] arr = {7, 5, 1, 8, 6};
        int target = 13;

        int init = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            init = arr[i];
            for (int j = i + 1; j < arr.length; j++) {

                if (init + arr[j] == target) {
                    System.out.println(init + "," + arr[j]);

                }
            }


        }
    }
}




