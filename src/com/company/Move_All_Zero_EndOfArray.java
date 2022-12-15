package com.company;

import java.util.Arrays;

public class Move_All_Zero_EndOfArray {

    /*
       Input : arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}
       Output : [1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0]
       */
            public static void main(String args[]){

                int []arr =  {1, 2, 0, 0, 0, 3, 6};

                for(int i=0;i<arr.length;i++){
                    if(arr[i]==0) {
                        for (int j = i; j < arr.length; j++) {
                           if(arr[j]>0) {
                               arr[i] = arr[j];
                               arr[j] = 0;
                               break;
                           }
                        }
                    }
                }
                System.out.println(Arrays.toString(arr));
            }
}
