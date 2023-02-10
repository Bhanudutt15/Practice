package com.company;

public class Palindrome {

    public static void main(String args[]){

        String s = "A man, a plan, a canal: Panama";
        Palindrome pa = new Palindrome();
        System.out.println( pa.isPalidrome(s));
    }
    public boolean isPalidrome(String s){
        s = s.replaceAll("\\s","");
        String test = "";
        String rev = "";

        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(Character.isAlphabetic(ch)||Character.isDigit(ch)){
                test=test+ch;
            }
        }
        test = test.toLowerCase();

        for(int i=test.length()-1;i>=0;i--){
            rev=rev+test.charAt(i);
        }
        if(test.equalsIgnoreCase(rev)){
         return true;
        }
           return false;
    }
}


        /*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/

