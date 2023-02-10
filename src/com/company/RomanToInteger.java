package com.company;

public class RomanToInteger {

    public static void main(String args[]){

        String s = "MDLXX";
        //MCMXCIV
        int val = 0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){

                case 'I':
                    if(s.charAt(i+1)=='V'){
                    val =val+4;
                    i++;
                    }
                    else if(s.charAt(i+1)=='X'){
                        val = val+9;
                        i++;
                        System.out.println(i);
                    }
                    else{

                        val =val+1;
                    }
                    break;
                case 'V':
                    val =val+5;
                    break;
                case 'X':
                    if(s.charAt(i+1)=='L'){
                        val =val+40;
                        i++;
                    }
                    else if(s.charAt(i+1)=='C'){
                        val = val+90;
                        i++;
                    }
                    else {
                        val = val + 10;
                    }
                    break;
                case 'L':
                    val =val+50;
                    break;
                case 'C':
                    if(s.charAt(i+1)=='D'){
                        val =val+400;
                        i++;
                    }
                    else if(s.charAt(i+1)=='M'){
                        val = val+900;
                        i++;
                    }
                    else {
                        val = val + 100;
                    }
                    break;
                case 'D':
                    val =val+500;
                    break;
                case 'M':
                    val =val+1000;
                    break;
                default:
            }
        }

        System.out.println(val);
    }
}
