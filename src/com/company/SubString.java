package com.company;

import java.util.HashSet;
import java.util.Set;

public class SubString {

    public static void main(String args[]){

        String s = "AA";
        String sub = "";
        int max = 0;
        int len = 0;
        String out = "";
        Set<Character> set = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            sub = String.valueOf(s.charAt(i));
           if(s.length()<=1){
               out=s;
               break;
           }
            set.clear();
            set.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    sub=sub+s.charAt(j);
                    len=sub.length();
                }
                else {
                    break;
                }
            }
                    if(len>max){
                        max= len;
                        out=sub;
                    }
                }
        System.out.println(out);
    }
}
