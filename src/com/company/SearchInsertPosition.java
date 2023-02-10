package com.company;

public class SearchInsertPosition {

    public static void main(String args[]){
        int [] nums = {1,3,4,5,6,8};
        int target = 6;
        int low =0;
        int count =0;
        int high = nums.length;
       for(int i=0;i<nums.length;i++){
             count = (low + high) / 2;
            if (target > nums[count]) {
                low = count;
            }
          else if(nums[count]==target){
               System.out.println(count);
               break;
           }

            else {
                high = count;
            }


        }

    }
}


/*Given a sorted array of distinct integers and a target value, return the index if the target is found.
 If not, return the index where it would be if it were inserted in order.
 Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

 */