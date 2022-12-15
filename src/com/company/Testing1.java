package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

class TestClass  {

    public static void main(String arg[]){
       int arr [] = {1};
            int n = 2;
       Arrays.sort(arr);

       System.out.println(Arrays.toString(arr));
       int count = 1;

       for(int i=0;i<2;i++){

           if(count!=arr[i]){
               System.out.println(count);
               count++;
           }
           count++;

       }
    }
}