package com.company;

import java.util.Arrays;

public class PlusOne {
    public static void main(String args[]){

        int [] digits = {9,9};
        //add 1 in last integer of array

        for(int i=digits.length-1;i>=0;i--) {

            if (digits[i] < 9) {
                digits[i]++;
                break;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        System.out.println(Arrays.toString(digits));




    }
}
