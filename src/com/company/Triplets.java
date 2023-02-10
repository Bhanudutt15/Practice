package com.company;

import java.util.*;

public class Triplets {

    public static void main(String args[]){

       int [] A = {5, 10, 18, 7, 8, 3};
       Arrays.sort(A);

            int num=0;
            // Implement your solution here
            int count=0;
            int n= A.length;
          //  Arrays.sort(A);
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    for(int k=j+1;k<n;k++){

                        if((A[i]+A[j]>A[k])&&(A[j]+A[k]>=A[i])&&(A[k]+A[i]>=A[j])){
                            num = A[i]+A[j]+A[k];
                        }
                    }
                }
            }

        System.out.println(Arrays.toString(A));
                System.out.println(num);
    }
}
