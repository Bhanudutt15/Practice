package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedList {

    public static void main(String args[]){

        RemoveDuplicatesfromSortedList re  = new RemoveDuplicatesfromSortedList();
        re.list();
    }

    public void list(){

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,0));
        int temp = arr.get(0);

        for(int i=0;i<arr.size()-1;i++){
            if(temp==arr.get(i+1)){
                arr.remove(i+1);
                i--;
            }
            else {
                temp = arr.get(i + 1);
            }
        }
        System.out.println(arr);
    }
}
