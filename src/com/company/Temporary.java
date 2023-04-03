package com.company;

import java.util.*;

public class Temporary {

public static void main(String args[]){


   int [] arr1 = { 1, 3, 4, 5};
     int [] arr2 = {2, 4, 6, 8, 10, 12};

     List<Integer> li = new ArrayList<>();
int count =0;
   for(int i=0;i<arr2.length;i++){

       li.add(arr2[i]);
   }
   for(int j=0;j<arr1.length;j++){
       int num = arr1[j];
        for(int k=count;k<li.size();k++){

            if(num<li.get(k)){
                count=k;
                li.add(k,num);
                count++;
                break;
            }
        }
   }


    System.out.println(li);


}
}
