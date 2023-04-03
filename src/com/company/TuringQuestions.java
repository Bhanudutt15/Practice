package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TuringQuestions {
        public static void main(String[] args){

            // if C then remove the last digit from list, if D comes add last digit 2 times and add it to the new list, if + comes add last 2 numbers and make entry to list
            /*
             * [5,2]
             * now C comes so [5]
             * now D comes so 5*2=10 , [5,10]
             * now + comes so last 2 numbers ar 5,10 hence 5+10 =15, [5,10,15]
             *
             * */
            String s = "52CD+";
            List<String> arr = new ArrayList<>();

            String [] str = s.split("");
            System.out.println(Arrays.toString(str));

            for(int i=0;i<str.length;i++){
                Character ch = s.charAt(i);
                if(Character.isDigit(ch)){

                    arr.add(String.valueOf(s.charAt(i)));
                }
                if(ch=='C'){


                }
            }
            System.out.println(arr);

        }
}
