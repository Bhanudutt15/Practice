package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test23 {

    public static void main(String args[]){

       // ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(1,3,4,5));

    int num1=0;
    int num=0;
        int sum =0;
        int plastic =0;
        int metal = 0;
        int glass = 0;
        // Implement your solution here

        int [] D = {3,2,4};
        String [] T = {"MPM","","G"};

        for(int i=0;i<T.length;i++){
            sum = sum+D[i];
            String s = T[i];
            int count1=0;int count2=0;int count3=0;
            for(int j=0;j<s.length();j++){

                if(s.charAt(j)=='P'){
                    if(count1==0){
                        plastic=sum;
                    }
                    plastic=plastic+1;
                    count1++;
                }
                else if(s.charAt(j)=='G'){
                    if(count2==0){
                        glass=sum;
                    }
                    glass=glass+1;
                    count2++;
                }

                else if(s.charAt(j)=='M'){
                    if(count3==0){
                        metal=sum;
                    }

                    metal=metal+1;
                    count3++;
                }
            }
            if(count1>0){
                plastic=plastic+sum;
            }
            else if(count2>0){
                glass =glass+sum;
            }
            else if(count3>0){
                metal =metal+sum;
            }
        }
        num1 =Math.max(plastic,glass);
        num=Math.max(num1,metal);

        System.out.println(num);
        System.out.println(plastic  + " " + metal+ " " + glass);

    }
}
