package com.company;

import java.util.Arrays;

public class Rearrange_Array {

    public static void main(String[] args) {

        /*
        Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
        Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
        */

        int [] arr = {-1, -1, 2, 3, 9, -1, 5, -1, 4, 1};

        for(int i=0; i<arr.length;i++){

            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        }
    }

