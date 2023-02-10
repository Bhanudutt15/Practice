package com.company;

import java.math.BigInteger;
import java.util.*;

public class Practice {

   public static void main(String args[]){

      int [] digits = {9,9};

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
