package com.company;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static void main(String args[]){

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int [] nums = {2,2,1,1,1,2,2};
        for(int i=0;i<nums.length;i++){

            if(!map.containsKey(nums[i])){

                map.put(nums[i],1);
            }
            else {
               int val = map.get(nums[i]);
               val =val+1;
               map.put(nums[i],val);
            }

        }
        System.out.println(map);
        for(Map.Entry<Integer, Integer> ma : map.entrySet()){

            if(ma.getValue()>nums.length/2){
                System.out.println(ma.getKey());
            }
        }
    }
}
